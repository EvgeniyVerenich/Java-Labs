package com.company;

import java.util.Date;

public class Notepad {



    private final Text text;
    private String date;

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    static class Text{

        private String text;

        public Text(String text){
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }


    }

    public Notepad(String date,Text text){
        this.text = text;
        this.date = date;
    }



    public void showNote(){
        System.out.println("Заметка : "+" "+ date+" "+text.getText());
    }

}
