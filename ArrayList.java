package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Integer> number = new ArrayList<Integer>();

        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);

        //array size
        System.out.println("ArrayList contains : "+number);
        System.out.println("Size = "+number.size());

/*
        //remove elements
        number.remove(2);
        System.out.println("After removing ArrayList contains : "+number);


        //removing all
        number.removeAll(number);
        System.out.println("After removing All ArrayList contains : "+number);


        //clear
        number.clear();
        System.out.println("After Clear ArrayList contains : "+number);


        //empty
        boolean check = number.isEmpty();
        System.out.println("ArrayList Empty : "+check);


        //empty
        number.clear();
        boolean b = number.isEmpty();
        System.out.println("ArrayList Empty : "+b);

       //contains
        boolean p = number.contains(30);
        System.out.println("30 is in the list : "+p);

        //index number position
        int pos= number.indexOf(40);
        System.out.println("The index of 40 is : "+pos);

*/
        //replace set
        number.set(3,50);
        System.out.println("After setting : "+number);


        //get
        int x = number.get(0);
        System.out.println("Index 0 ="+x);
    }
}
  /* output
        ArrayList contains : [10, 20, 30, 40]
        Size = 4
        After removing ArrayList contains : [10, 20, 40]
        After removing All ArrayList contains : []*/

