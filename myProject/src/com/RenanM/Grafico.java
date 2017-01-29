package com.RenanM;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

import javax.swing.*;
import java.util.List;

/**
 * Created by Marcel on 1/26/2017.
 */
public class Grafico extends JFrame{
    private String titulo;
    private JFreeChart grafico;
    private String colunaY;

    private void teste(){
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(Painel());
        this.setVisible(true);
    }

    public Grafico(String titulo, List<Caracteristicas> lista, int opcao) {
        this.titulo = "Grafico acao: " + titulo;
        XYDataset novo = criardata(lista, opcao);
        grafico = ChartFactory.createTimeSeriesChart(this.titulo, "Intervalo de tempo", this.colunaY, novo, false, false, false);
        teste();
    }

    private XYDataset criardata(List<Caracteristicas> lista, int opcao) {
        TimeSeriesCollection dataset = new TimeSeriesCollection();
        switch (opcao) {
            case 0:
                this.colunaY = "Abertura";
                TimeSeries series1 = new TimeSeries("Abertura");
                for (int i = 0; i < lista.size(); i++) {
                    series1.add(new Day(lista.get(i).getDate()), lista.get(i).getOpen());
                    dataset.addSeries(series1);
                }
                break;
            case 1:
                this.colunaY = "Alta";
                TimeSeries series2 = new TimeSeries("Alta");
                for (int i = 0; i < lista.size(); i++) {
                    series2.add(new Day(lista.get(i).getDate()), lista.get(i).getHigh());
                    dataset.addSeries(series2);
                }
                break;
            case 2:
                this.colunaY = "Baixa";
                TimeSeries series3 = new TimeSeries("Baixa");
                for (int i = 0; i < lista.size(); i++) {
                    series3.add(new Day(lista.get(i).getDate()), lista.get(i).getLow());
                    dataset.addSeries(series3);
                }
                break;
            case 3:
                this.colunaY = "Fechar";
                TimeSeries series4 = new TimeSeries("Fechar");
                for (int i = 0; i < lista.size(); i++) {
                    series4.add(new Day(lista.get(i).getDate()), lista.get(i).getClose());
                    dataset.addSeries(series4);
                }
                break;
            case 4:
                this.colunaY = "Ajuste";
                TimeSeries series5 = new TimeSeries("Ajuste");
                for (int i = 0; i < lista.size(); i++) {
                    series5.add(new Day(lista.get(i).getDate()), lista.get(i).getAdjClose());
                    dataset.addSeries(series5);
                }
                break;
            case 5:
                this.colunaY = "Volume";
                TimeSeries series6 = new TimeSeries("Volume");
                for (int i = 0; i < lista.size(); i++) {
                    series6.add(new Day(lista.get(i).getDate()), lista.get(i).getVolume());
                    dataset.addSeries(series6);
                }
                break;
            }
        return dataset;
    }

    private JPanel Painel(){
        return new ChartPanel(grafico);
    }

}
