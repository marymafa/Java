package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try{
            int[] numbers = {1,2,3,5,5,6,7,8,9};
            System.out.println(numbers[10]);
        } catch (Exception e){
            System.out.println("something went wrong!");
        }
    }
}
