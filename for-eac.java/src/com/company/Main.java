package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> items = new ArrayList<>();
        items.add("mayonise");
        items.add("noodles");
        items.add("milk");
        items.add("washing powder");
        items.add("tea bags");

        items.forEach(item -> System.out.println(item));
    }
}
