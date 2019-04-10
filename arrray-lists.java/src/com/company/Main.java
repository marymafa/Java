package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> names = new ArrayList<String>();
        names.add("mary");
        names.add("mercy");
        names.add("abel");
        names.add("zane");
        System.out.println(names);
        System.out.println(names.get(0));
        //foreach
        Collections.sort(names);
        for (String i : names) {
            System.out.println(i);
        }
    }
}
