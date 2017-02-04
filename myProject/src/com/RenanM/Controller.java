package com.RenanM;

import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/**
 * Created by Marcel on 2/4/2017.
 */
public class Controller {

    @FXML
    private TextField Entradasimbolo;

    @FXML
    private TextField Escolha;

    @FXML
    private Button BotaoGrafico;

    @FXML
    private DatePicker Datainicial;

    @FXML
    private DatePicker Datafinal;

    @FXML
    private BorderPane mainBP;
    @FXML
    private Button Botaofinal;

    @FXML
    private Button Botaoprocura;

    @FXML
    private Label Valorencontrado;

    @FXML
    private Label datainicialencontrada;

    @FXML
    private Label datafinalencontrada;

    @FXML
    private TableView<Caracteristicas> TabelaAcao;

    private Alert alert = new Alert(Alert.AlertType.INFORMATION);

    private String simbolo;
    private Simbolos simbolos;
    private List<Caracteristicas> lista;
    private Date dateinicio, datefinal;
    private Acao acao;
    private Grafico grafico;

    public void initialize(){
        Entradasimbolo.clear();
        TabelaAcao.setItems(null);
        Entradasimbolo.setDisable(false);
        Escolha.setDisable(true);
        Escolha.clear();
        Datafinal.setValue(null);
        Datainicial.setValue(null);
        Valorencontrado.setText("");
        datafinalencontrada.setText("");
        datainicialencontrada.setText("");
        Botaoprocura.setDisable(true);
        Valorencontrado.setDisable(true);
        Datainicial.setDisable(true);
        Datafinal.setDisable(true);
        Botaofinal.setDisable(true);
        BotaoGrafico.setDisable(true);
        datainicialencontrada.setDisable(true);
        datafinalencontrada.setDisable(true);
        simbolos = new Simbolos();

    }

    @FXML
    public void instrucoes(){
        alert.setTitle("Instruções");
        alert.setHeaderText("O primeiro campo é necessário ser digitado em letras maisculas \n" +
                "A lista de simbolos se encontra no menu de ajuda caso necessário \n");
        alert.setContentText("A data inicial não pode ser o dia atual \n" +
                "A data final não pode ser anterior a data inicial \n" +
                "Ambas encontraram as datas mais próximas disponiveis na ação escolhida \n" +
                "Toda produção do grafico é em relacao as datas \n" +
                "No campo final, digite um índice da tabela [Alta, Fechar, etc]");
        alert.showAndWait();
    }

    @FXML
    public void print() throws IOException{
        Dialog<ButtonType> janela = new Dialog<>();
        janela.initOwner(mainBP.getScene().getWindow());
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("ListsimbolosUI.fxml"));
        janela.getDialogPane().setContent(fxmlLoader.load());
        janela.getDialogPane().getButtonTypes().add(ButtonType.OK);
        Optional<ButtonType> resultado = janela.showAndWait();
        if(resultado.isPresent() && resultado.get() == ButtonType.OK){
        }
    }

    @FXML
    public void reiniciar(){
        initialize();
    }

    @FXML
    public void Caixavazia(){
        String texto = Entradasimbolo.getText();
        boolean vazio = texto.isEmpty() || texto.trim().isEmpty();
        Botaoprocura.setDisable(vazio);
    }

    @FXML
    public void Clicarbotao() throws IOException, ParseException{
        String texto = Entradasimbolo.getText();
        if(simbolos.contains(texto)){
            this.simbolo = Entradasimbolo.getText().toString();
            Valorencontrado.setText(simbolos.getarqvnome(texto));
            Botaoprocura.setDisable(true);
            Entradasimbolo.setDisable(true);
            Datainicial.setDisable(false);
            popularlista();
        } else {
            alert.setTitle("Erro");
            alert.setHeaderText(null);
            alert.setContentText("Simbolo não encontrado");
            alert.showAndWait();
        }
    }

    @FXML
    public void datas() throws ParseException {
        Date dataformatada;
        SimpleDateFormat formatar = new SimpleDateFormat("yyyy-MM-dd");
        if (Datainicial.getValue() != null) {
            if(Datainicial.getValue().isAfter(LocalDate.now()) || Datainicial.getValue().equals(LocalDate.now())) {
                alert.setTitle("Erro");
                alert.setHeaderText(null);
                alert.setContentText("Data inicial invalida");
                alert.showAndWait();
            } else {
                Datafinal.setDisable(false);
                dataformatada = formatar.parse(Datainicial.getValue().toString());
                this.dateinicio = this.acao.getmindata(dataformatada);
                this.datainicialencontrada.setText(this.dateinicio.toString());
                Datainicial.setDisable(true);
            }
        }
        if(Datafinal.getValue() != null) {
            if (Datafinal.getValue().isBefore(Datainicial.getValue()) || Datafinal.getValue().equals(Datainicial.getValue())) {
                alert.setTitle("Erro");
                alert.setHeaderText(null);
                alert.setContentText("Data final invalida");
                alert.showAndWait();
            } else {
                dataformatada = formatar.parse(Datafinal.getValue().toString());
                this.datefinal = this.acao.getmaxdata(dataformatada);
                this.datafinalencontrada.setText(this.datefinal.toString());
                Datafinal.setDisable(true);
                Botaofinal.setDisable(false);
            }
        }
    }

    public void popularlista() throws IOException, ParseException {
        lista = new ArrayList<>();
        URLConnection con = (simbolos.getarqurl(this.simbolo)).openConnection();
        InputStream is = con.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line;
        br.readLine();
        while((line = br.readLine()) != null){
            SimpleDateFormat formatar = new SimpleDateFormat("yyyy-MM-dd");
            String[] datasep = line.split(",");
            Date date = null;
            Double open = null;
            Double high = null;
            Double low = null;
            Double close = null;
            Double volume = null;
            Double adjClose;
            int i=0;
            while(i<7) {
                switch (i) {
                    case 0:
                        date = formatar.parse(datasep[i]);
                        break;
                    case 1:
                        open = Double.parseDouble(datasep[i]);
                        break;
                    case 2:
                        high = Double.parseDouble(datasep[i]);
                        break;
                    case 3:
                        low = Double.parseDouble(datasep[i]);
                        break;
                    case 4:
                        close = Double.parseDouble(datasep[i]);
                        break;
                    case 5:
                        volume = Double.parseDouble(datasep[i]);
                        break;
                    case 6:
                        adjClose = Double.parseDouble(datasep[i]);
                        Caracteristicas novo = new Caracteristicas(date, open, high, low, close, volume, adjClose);
                        this.lista.add(novo);
                        break;
                }
                i++;
            }
        }
        this.acao = new Acao(this.Valorencontrado.toString(), this.lista);

    }


    @FXML
    public void InserirTabela(){
        ObservableList<Caracteristicas> list = acao.intervaloList(dateinicio, datefinal);
        SortedList<Caracteristicas> sortedList = new SortedList<>(list, new Comparator<Caracteristicas>() {
            @Override
            public int compare(Caracteristicas o1, Caracteristicas o2) {
                return o2.getDate().compareTo(o1.getDate());
            }
        });
        this.TabelaAcao.setItems(sortedList);
        Botaofinal.setDisable(true);
        Escolha.setDisable(false);
        alert.setTitle("Aviso");
        alert.setHeaderText(null);
        alert.setContentText("Após produzir um grafico, fecha-lo resultará no fim do sistema");
        alert.showAndWait();
    }

    @FXML
    public void Caixavazia2(){
        String texto = Escolha.getText();
        BotaoGrafico.setDisable(true);
        if(texto.toLowerCase().equals("data")){
            alert.setTitle("Aviso");
            alert.setHeaderText(null);
            alert.setContentText("Todo grafico ja é em relação a data");
            alert.showAndWait();
        }
        if(texto.toLowerCase().equals("abertura") || texto.toLowerCase().equals("alta") || texto.toLowerCase().equals("baixa") ||
                texto.toLowerCase().equals("fechar") || texto.toLowerCase().equals("volume") || texto.toLowerCase().equals("ajuste")){
            BotaoGrafico.setDisable(false);
        }
    }

    @FXML
    public void Graficoescolha(){
        String texto = Escolha.getText();
        int opcao=4;
        List<Caracteristicas> list = this.acao.intervaloList(dateinicio, datefinal);
        if(texto.toLowerCase().equals("abertura")){
            opcao = 0;
        } else if(texto.toLowerCase().equals("alta")){
            opcao = 1;
        } else if(texto.toLowerCase().equals("baixa")){
            opcao = 2;
        } else if(texto.toLowerCase().equals("fechar")){
            opcao = 3;
        } else if(texto.toLowerCase().equals("ajuste")){
            opcao = 4;
        } else if(texto.toLowerCase().equals("volume")){
            opcao = 5;
        }

        grafico = new Grafico(this.simbolos.getarqvnome(simbolo), list, opcao);
        grafico.teste();
    }
}
