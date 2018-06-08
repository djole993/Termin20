package com.example.androiddevelopment.termin20.model;

public class Film {
    int id;
    String naziv;

    Film(){}

    public Film(int id, String naziv){
        this.id = id;
        this.naziv = naziv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
