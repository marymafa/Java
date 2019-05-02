package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread thread = new Thread("New Thread") {
            public void run(){
                System.out.println("run by: " + getName());
            }
        };

        thread.start();
        System.out.println(thread.getName());

    }
}
