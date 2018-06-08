package com.example.androiddevelopment.termin20.provider;

import com.example.androiddevelopment.termin20.model.Film;

import java.util.ArrayList;
import java.util.List;

public class FilmProvider {
    public static List<Film> getFilmovi(){
        ArrayList<Film>filmovi = new ArrayList<>();
        filmovi.add(new Film(0, "Kad bude mrtav i beo"));
        filmovi.add(new Film(1, "Lavirint"));
        return filmovi;
    }
    public static List<String> getFilmNames(){
        List<String> names = new ArrayList<>();
        names.add("Kad budem mrtav i beo");
        names.add("Lavirint");
        return names;
    }
    public static Film getFilmyById(int id) {
        switch (id) {
            case 0:
                return new Film(0, "Kad budem mrtav i beo");
            case 1:
                return new Film(1, "Lavirint");
            default:
                return null;
        }
    }
}
