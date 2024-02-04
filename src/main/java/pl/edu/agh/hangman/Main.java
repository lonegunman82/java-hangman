package pl.edu.agh.hangman;

import java.util.List;


public class Main {


    public static void main(String[] args) {
        WczytajPlik wczytajPlik = new WczytajPlik("slowa.txt");
        Slowo slowo = new Slowo();
        slowo.wylosuj_Slowo(wczytajPlik.getLiniePliku());
        slowo.duze_Litery();
        slowo.usunKolejneWyrazy();
        System.out.println(slowo.slowo);

    }

}

