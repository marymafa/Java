package com.company;

public class Main{
    int x;

    public  Main(){
        x =5;
    }

    public static void main(String[] args){
        Main newObject = new Main();
        System.out.println(newObject.x);
    }
}