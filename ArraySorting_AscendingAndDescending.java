package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] number = {10,-3,6,8,9};
        Arrays.sort(number);


        System.out.print("Ascending : ");
        for(int i=0; i<5; i++)
        {
            System.out.print(" "+number[i]);
        }

        System.out.println();

        System.out.print("Descending : ");
        for(int i=4; i>=0; i--)
        {
            System.out.print(" "+number[i]);
        }


        System.out.println();
        String[] names = {"naiim","abu","rayhan","siddique"};
        Arrays.sort(names);

        for(int i=0; i<4; i++)
        {
            System.out.print(" "+names[i]);
        }

        System.out.println();

        //reverse
        for(int i=3; i>=0; i--)
        {
            System.out.print(" "+names[i]);
        }
    }
}
/*output
        Ascending :  -3 6 8 9 10
        Descending :  10 9 8 6 -3
        abu naiim rayhan siddique
        siddique rayhan naiim abu*/