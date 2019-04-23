package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] myArray = new int[23];

        for (int i=0; i<myArray.length; i++){
            myArray[i] = i*10;

        }
        printArray(myArray);
    }
    public static void printArray(int[] array){

for(int i=0; i<array.length; i++){
    System.out.println( "value is" + " " + array[i]);
    System.out.println("element" + " " + i);
};
    }
}
