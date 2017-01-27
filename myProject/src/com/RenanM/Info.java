package com.RenanM;

import java.io.IOException;
import java.net.URL;

/**
 * Created by Marcel on 1/27/2017.
 */

public class Info {
    private final String nome;
    private final URL url;

    public Info(String nome, String url) {
        this.nome = nome;
        this.url = convert(url);
    }

    private URL convert (String url){
        URL novo = null;
        try {
            novo = new URL(url);
        } catch (IOException e){
            e.printStackTrace();
        }
        return novo;
    }

    public String getNome() {
        return nome;
    }

    public URL getUrl() {
        return url;
    }
}
