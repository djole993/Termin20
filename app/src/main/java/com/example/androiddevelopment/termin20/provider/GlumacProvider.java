package com.example.androiddevelopment.termin20.provider;

import android.annotation.SuppressLint;
import android.icu.text.DateTimePatternGenerator;

import com.example.androiddevelopment.termin20.model.Glumac;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class GlumacProvider {

    public SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    public static List<Glumac> getGlumaci(){
        ArrayList<String>filmovi = new ArrayList<>();
        String f1 = "Kad budme mrtav i beo";
        String f2 = "Lavirint";
        filmovi.add(f1);
        filmovi.add(f2);
        List<Glumac>glumci = new ArrayList<>();
        glumci.add(new Glumac("Dragan1", "Nikolic", "Rodjen tad i tad tu i tu", "Dragan_Nikolić.jpg",5, null,null,filmovi));
        glumci.add(new Glumac("Dragan2", "Nikolic", "Rodjen tad i tad tu i tu", "Dragan_Nikolić.jpg",5, null,null,filmovi));
        glumci.add(new Glumac("Dragan3", "Nikolic", "Rodjen tad i tad tu i tu", "Dragan_Nikolić.jpg",5, null,null,filmovi));

        return glumci;
    }
    public static List<String> getGlumciNames(){
        List<String> names = new ArrayList<>();
        names.add("Dragan Nikolic");
        names.add("Dragan Nikolic");
        names.add("Dragan Nikolic");
        return names;
    }
    public static Glumac getGlumacById(int id){
        ArrayList<String>filmovi = new ArrayList<>();
        String f1 = "Kad budme mrtav i beo";
        String f2 = "Lavirint";
        filmovi.add(f1);
        filmovi.add(f2);
        switch (id){
            case 0:
                return new Glumac("Dragan1", "Nikolic", "Rodjen tad i tad tu i tu", "Dragan_Nikolić.jpg",5, null,null,filmovi);
            case 1:
                return new Glumac("Dragan2", "Nikolic", "Rodjen tad i tad tu i tu", "Dragan_Nikolić.jpg",5, null,null,filmovi);
            case 2:
                return new Glumac("Dragan3", "Nikolic", "Rodjen tad i tad tu i tu", "Dragan_Nikolić.jpg",5, null,null,filmovi);
            default:
                return null;
        }

    }
}
