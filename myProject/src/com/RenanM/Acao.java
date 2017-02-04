package com.RenanM;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Marcel on 1/25/2017.
 */
public class Acao {
    private final String nome;
    private List<Caracteristicas> precos;

    public Acao(String nome, List<Caracteristicas> precos) {
        this.nome = nome;
        this.precos = new ArrayList<>(precos);
    }

    public List<Caracteristicas> getPrecos() {
        return this.precos;
    }

    public Date getmindata(Date date){
        Date data = null;
        for(int i=0; i<precos.size(); i++){
            if((precos.get(i).getDate().before(date)) && precos.get(i).getAdjClose() != null){
                return data;
            }
            data = precos.get(i).getDate();
        }
        return data;
    }

    public Date getmaxdata(Date date){
        Date data = precos.get(0).getDate();
        for(int i=0; i<precos.size(); i++){
            if((date.after(precos.get(i).getDate()) || date.equals(precos.get(i).getDate()) && precos.get(i).getAdjClose() != null) ){
                data = precos.get(i).getDate();
                return data;
            }
        }
        return data;
    }

<<<<<<< HEAD
=======
//    public void printprecodata(Date inicial, Date date2){
//        Date data = inicial;
//        Caracteristicas nova;
//        List<Caracteristicas> lista = new ArrayList<>();
//        do{
//            nova = findcar(data);
//            if(nova != null){
//                lista.add(nova);
//            }
//            Calendar c = Calendar.getInstance();
//            c.setTime(data);
//            c.add(Calendar.DATE, 1);
//            data = c.getTime();
//        } while (!data.equals(date2));
//
//        System.out.println(lista.size() + " datas diferentes.");
//
//        for(Caracteristicas car : lista){
//            System.out.println(car.toString());
//        }
//    }
>>>>>>> 6739e0a04bd68ed6d94334d486a41feaaec1a49f

    private Caracteristicas findcar(Date data){
        Caracteristicas nova = null;
        for(int i=0; i<precos.size(); i++){
            if(precos.get(i).getDate().equals(data)){
                nova = precos.get(i);
                return nova;
            }
        }
        return nova;

    }

    public ObservableList<Caracteristicas> intervaloList(Date inicio, Date fim){
        Date data = inicio;
        Caracteristicas nova;
        List<Caracteristicas> lista = new ArrayList<>();
        do{
            nova = findcar(data);
            if(nova != null){
                lista.add(nova);
            }
            Calendar c = Calendar.getInstance();
            c.setTime(data);
            c.add(Calendar.DATE, 1);
            data = c.getTime();
        } while (!data.equals(fim) && data.before(fim));


        ObservableList<Caracteristicas> list = FXCollections.observableArrayList(lista);
        return list;
    }



}
