package com.example.pitbullmanager;

public class User {

    String name,estado,numero,direccion,cinta;
    int imageId;

    public User(String name, String estado, String numero, String direccion, String cinta, int imageId) {
        this.name = name;
        this.estado = estado;
        this.numero = numero;
        this.direccion = direccion;
        this.cinta = cinta;
        this.imageId = imageId;
    }
}
