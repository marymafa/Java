package com.company;

public class BinaryChop {

    public  static int chop(int search, int[] array) {

        int min = 0;
        int max = array.length - 1;

        while( min <= max){
            int middle =(array.length)/2;
            if(search < array[middle]){
                max = middle -1;
            }
            if(search > array[middle]){
                min = middle + 1;
            }
            if(search == array[middle]){
                return middle;

            }
        };

        return -1;


    }
}
