package com.company;

import java.util.Enumeration;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hashtable<Integer,String> hash = new Hashtable<Integer, String>();

         hash.put(4, "mary");
        hash.put(4, "mary");
        hash.put(4, "mary");
        hash.put(4, "mary");
        Enumeration el= hash.keys();
        while(el.hasMoreElements()){
            System.out.println(el);
        };

        System.out.println(hash);
        System.out.println(el);
    }
}
