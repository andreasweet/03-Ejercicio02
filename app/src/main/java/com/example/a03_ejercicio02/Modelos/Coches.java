package com.example.a03_ejercicio02.Modelos;

public class Coches {
    private String marca;
    private String coche;
    private String color;

    public Coches(String marca, String coche, String color) {
        this.marca = marca;
        this.coche = coche;
        this.color = color;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCoche() {
        return coche;
    }

    public void setCoche(String coche) {
        this.coche = coche;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
