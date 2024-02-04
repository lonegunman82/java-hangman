package pl.edu.agh.hangman;

import java.util.Scanner;

public class Hangman {

    public static final String[] HANGMANPICS = new String[]{
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========"
    };

    public static void main(String[] args) {
        String word = "JAVA";
        Screen s = new Screen();
        s.setPicture(HANGMANPICS[0]);
        s.setWord(word);
        s.createBlankWord();
        s.displayScreen();
        boolean wygrana = false;
        for(int n=1; n<HANGMANPICS.length; n++){
            String letter = takeLetterFromUser();
            if(checkLetterFromUser(letter)){
                boolean flaga = false;
                for(int i=0;  i<word.length(); i++){
                    if(word.charAt(i)==letter.charAt(0)){
                        s.blankWord.set(i, letter);
                        flaga = true;
                    }
                }
                if(flaga){
                    s.displayScreen();
                } else{
                    System.out.println("nie ma litery");
                    s.setPicture(HANGMANPICS[n]);
                    s.displayScreen();
                }
            }
            if(!s.blankWord.contains("_")){
                wygrana=true;
                break;
            }
        }
        if(wygrana){
            System.out.println("Gratulacje, wygrałeś");
        } else System.out.println("niestety nie tym razem");



    }

    public static String takeLetterFromUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj literę: ");
        String letter = scan.nextLine();
        return letter;
    }

    public static boolean checkLetterFromUser(String letter){ //można rozbudowac o następne warunki
    if(letter.length()==1){
        return true;
    } else return false;
    }

}
