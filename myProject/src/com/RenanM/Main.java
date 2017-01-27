package com.RenanM;

import java.io.*;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// AINDA EM ANDAMENTO

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Simbolos simbolos = new Simbolos();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o simbolo: ");
        String keyarqv = ler.nextLine();
        while(!simbolos.contains(keyarqv)){
            System.out.println("Entradas validas [ENTER]: ");
            ler.nextLine();
            simbolos.print();
            keyarqv = ler.nextLine();
        }
        URLConnection con = (simbolos.getarqurl(keyarqv)).openConnection();
        InputStream is = con.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        SimpleDateFormat formatar = new SimpleDateFormat("yyyy-MM-dd");
        List<Caracteristicas> todosvalores = new ArrayList<>();
        String line;
        br.readLine();
        while((line = br.readLine()) != null){
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
                        todosvalores.add(novo);
                        break;
                }
                i++;
            }
        }

//        while(arq.hasNextLine()){
//            String data = arq.nextLine();
//            String[] datasep = data.split(",");
//            Date date = null;
//            Double open = null;
//            Double high = null;
//            Double low = null;
//            Double close = null;
//            Double volume = null;
//            Double adjClose = null;
//            int i=0;
//            while(i<7) {
//                switch (i) {
//                    case 0:
//                        date = formatar.parse(datasep[i]);
//                        break;
//                    case 1:
//                        open = Double.parseDouble(datasep[i]);
//                        break;
//                    case 2:
//                        high = Double.parseDouble(datasep[i]);
//                        break;
//                    case 3:
//                        low = Double.parseDouble(datasep[i]);
//                        break;
//                    case 4:
//                        close = Double.parseDouble(datasep[i]);
//                        break;
//                    case 5:
//                        volume = Double.parseDouble(datasep[i]);
//                        break;
//                    case 6:
//                        adjClose = Double.parseDouble(datasep[i]);
//                        Caracteristicas novo = new Caracteristicas(date, open, high, low, close, volume, adjClose);
//                        todosvalores.add(novo);
//                        break;
//                }
//                i++;
//            }
//        }

        Acao acao = new Acao(simbolos.getarqvnome(keyarqv), todosvalores);

        System.out.println("Digite a data inicial e final: [yyyy-mm-dd]");
        String data = ler.nextLine();
        Date datainicial = formatar.parse(data);
        data = ler.nextLine();
        Date datafinal = formatar.parse(data);
        datainicial = acao.getmindata(datainicial);
        datafinal = acao.getmaxdata(datafinal);
        System.out.println("Data inicial: " + datainicial);
        System.out.println("Data final: " + datafinal);

        //acao.printprecodata(datainicial, datafinal);

        System.out.println("Sucess");
    }
}
