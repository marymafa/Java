package com.company;

public class Main {

    enum Level{
        LOW ,
        MWDIEM,
        HIGH
    }

    public static void main(String[] args) {
	// write your code here
        Level myVar = Level.LOW;
        Level myVar1 = Level.HIGH;
        Level myVar2 = Level.MWDIEM;
        System.out.println(myVar);
        System.out.println(myVar1);
        System.out.println(myVar2);
    }
}
