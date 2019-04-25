package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while(true) {
            int order = count + 1;
            System.out.println(order);

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                count++;
                sum += number;
                if(count == 10){
                    break;
                }

            }else{
                System.out.println("invalid number");
                scanner.nextLine();

            }
            scanner.close();
        }
    }
}
