package com.javafundamental.collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Task 1");
        myList.add("Task 2");
        myList.add("Task 3");
        myList.add("Another Task");

        System.out.println("My List : ");

        for (String list : myList) {
            System.out.println(list);
        }

        System.out.printf("%nRemove 1 Item : %n");
        myList.remove("Another Task");
        for (String list : myList) {
            System.out.println(list);
        }

        System.out.printf("%nGet 1 element from List : %n");
        String firstItem = myList.get(0);
        System.out.println(firstItem);

        System.out.printf("%n%s", myList);

//        Get element size
        System.out.printf("%n list size is : %s", myList.size());
    }
}
