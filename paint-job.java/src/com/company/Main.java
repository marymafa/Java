package com.company;

import java.util.Scanner;

public class Main {
    int Area;

    public static int getBucketCount(double height, double width, double areaPerBucker, int extraBuckets){
     Scanner scanner = new Scanner(System.in);

        if(height <= 0 || width <= 0|| areaPerBucker <= 0|| extraBuckets <= 0){
            return -1;
        }else{
           Area =  Math.ceil(height * width )/ areaPerBucker + extraBuckets ;
            System.out.println(areaPerBucker);


     };
return (int)Area;
    };

    public static void main(String[] args) {
        System.out.println(getBucketCount(-3,2.1,1.5,2));
        System.out.println(getBucketCount(8.4,2.99,7.5,8));

    }
}
