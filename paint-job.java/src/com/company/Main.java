package com.company;

import java.util.Scanner;

public class Main {

    public static double getBucketCount(double height, double width, double areaPerBucker, double extraBuckets){
     Scanner scanner = new Scanner(System.in);

        if(height <= 0 || width <= 0|| areaPerBucker <= 0|| extraBuckets <= 0){
            return -1;
        }else{
           areaPerBucker = height * areaPerBucker * areaPerBucker /extraBuckets ;
            System.out.println(areaPerBucker);


     };
return areaPerBucker;
    };

    public static void main(String[] args) {
        System.out.println(getBucketCount(-3,2.1,1.5,2));
        System.out.println(getBucketCount(8.4,2.99,7.5,8));

    }
}
