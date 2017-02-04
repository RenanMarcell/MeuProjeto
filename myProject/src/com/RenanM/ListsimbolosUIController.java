package com.RenanM;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcel on 2/4/2017.
 */
public class ListsimbolosUIController {


    @FXML
    private ListView<String> ListaTit;

    private List<String> simbolos;
    private List<String> nomes;

    public void initialize(){
        nomes = new ArrayList<>(new Simbolos().getListnames());
        simbolos = new ArrayList<>(new Simbolos().getSimbolos());

        List<String> finalist = new ArrayList<>();
        for(int i=0; i<nomes.size(); i++){
            String result = simbolos.get(i) + ": " + nomes.get(i);
            finalist.add(result);
        }

        ObservableList<String> indice = FXCollections.observableArrayList(finalist);


        ListaTit.setItems(indice);
    }
}
