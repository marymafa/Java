package com.company;



public class User {
    private String firstName;
    private String secondName;


    public String  getName(){
        return firstName + secondName;
    };

    public void setName(String newName, String NewLastName){

        this.firstName = newName;
        this.secondName  = NewLastName;

    };





}


