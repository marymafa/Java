package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your name");
        System.out.println("enter your password");

        String userName =scan.nextLine();
        String password =scan.nextLine();

        System.out.println(" Username is " + userName + " " + password);
    }
}
