package com.company;

public class BinaryChop {

    public  static int chop(int search, int[] array) {



        
        int min = 0;
        int max = array.length-1;
//       System.out.println(max);

        while( min <= max){
            int middle = array.length/2;
            if(search < array[middle]){
                max = middle -1;
//                System.out.println(middle);
            }
            if(search > array[middle]){
                min = middle + 1;
//                System.out.println(min);
            }
            if(search == array[middle]){
                return middle;

            }
        };

        return -1;


    }
}
