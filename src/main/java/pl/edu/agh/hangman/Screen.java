package pl.edu.agh.hangman;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Screen {
    public ArrayList<String> blankWord = new ArrayList<>();

    private String word = "";
    private String picture = "";

    public String getPicture(){
        return picture;
    }
    public void setPicture(String picture){
        this.picture=picture;
    }
    public ArrayList<String> getBlankWord(){
        return blankWord;
    }
    public void setBlankWord(ArrayList<String> blankWord){
        this.blankWord=blankWord;
    }

    public String getWord(){
        return word;
    }
    public void setWord(String word){
        this.word=word;
    }

    public void displayScreen(){

        System.out.println(picture);
        String length = "";
        for(String l : blankWord){
            length += " ";
            length += l;
        }
        System.out.println(length);
    }

    public void createBlankWord(){
        for(String letter : word.split("")){
            this.blankWord.add("_");
        }
    }

}
