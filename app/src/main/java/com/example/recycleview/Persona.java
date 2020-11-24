package com.example.recycleview;

import android.widget.Button;

public class Persona {

    private int imagen;

    public Persona(int imagen, String texto, Button boton) {
        this.imagen = imagen;
        this.texto = texto;
        this.boton = boton;
    }

    public Persona(int imagen, String texto) {
        this.imagen = imagen;
        this.texto = texto;
    }

    private String texto;
    private Button boton;


    public int getImagen() {
        return imagen;
    }

    public String getTexto() {
        return texto;
    }

    public Button getBoton() { return boton; }
}
