package com.kodilla;

public class Mdul1Zadanie1 {

    public static void main (String[] args){

        User michal = new User ("michal", 32, 177);
        String howOld = michal.validateAge();
        String howTall = michal.validateHeight();

        System.out.println(howOld+" i "+howTall);

    }

}

class User {

    private String name;
    private int age;
    private int height;

    public User ( String name, int age, int height){

        this.name=name;
        this.age=age;
        this.height=height;

    }

    public String validateAge(){

        if (age>30) {
            return "Użytkownik "+name+" jest starszy niż 30 lat";
        } else {
            return "Użytkownik jest młodszy niż 30 lat";
        }

    }

    public String validateHeight(){

        if (height>170) {
            return "Użytkownik jest wyzszy niż 170cm";
        } else {
            return "Użytkownik jest nizszy niż 170cm";
        }

    }

}
