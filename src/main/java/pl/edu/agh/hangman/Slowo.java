package pl.edu.agh.hangman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Slowo {
    public String slowo;


    public void wylosuj_Slowo(List <String> tablica) {
        int wielkosc_listy = tablica.size();
        Random numer = new Random();
        String slowo = tablica.get(numer.nextInt(wielkosc_listy));
        this.slowo=slowo;
    }


    public String duze_Litery() {
        slowo=slowo.toUpperCase();
        return slowo;
    }

    public String usunKolejneWyrazy() {

        String lista[] = slowo.split("\\s+");
        this.slowo =lista[0];
        return slowo;

    }




}
