package pl.edu.agh.hangman;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class WczytajPlik {
    private String nazwa;
    private List<String> liniePliku;

    public WczytajPlik(String nazwaPliku) {
        this.nazwa = nazwaPliku;
        this.liniePliku = new ArrayList<>();

        File file = new File(this.nazwa);

        try (BufferedReader slowa = new BufferedReader(new FileReader(file))) {
            String linia;
            while ((linia = slowa.readLine()) != null) {
                liniePliku.add(linia);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getLiniePliku() {
        return liniePliku;
    }


}










