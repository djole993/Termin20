package com.example.androiddevelopment.termin20.model;

import java.util.ArrayList;
import java.util.Date;

public class Glumac {
    String ime;
    String prezime;
    String biografija;
    String slika;
    int ocena;
    Date datumRodjenja;
    Date datumSmrti;
    ArrayList<String>filmovi;

    Glumac(){}

    public Glumac(String ime, String prezime, String biografija, String slika, int ocena, Date datumRodjenja, Date datumSmrti, ArrayList<String> filmovi) {
        this.ime = ime;
        this.prezime = prezime;
        this.biografija = biografija;
        this.slika = slika;
        this.ocena = ocena;
        this.datumRodjenja = datumRodjenja;
        this.datumSmrti = datumSmrti;
        this.filmovi = filmovi;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBiografija() {
        return biografija;
    }

    public void setBiografija(String biografija) {
        this.biografija = biografija;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public Date getDatumSmrti() {
        return datumSmrti;
    }

    public void setDatumSmrti(Date datumSmrti) {
        this.datumSmrti = datumSmrti;
    }

    public ArrayList<String> getFilmovi() {
        return filmovi;
    }

    public void setFilmovi(ArrayList<String> filmovi) {
        this.filmovi = filmovi;
    }

    @Override
    public String toString() {
        return "Glumac{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", biografija='" + biografija + '\'' +
                ", slika='" + slika + '\'' +
                ", ocena=" + ocena +
                ", datumRodjenja=" + datumRodjenja +
                ", datumSmrti=" + datumSmrti +
                ", filmovi=" + filmovi +
                '}';
    }
}
