package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);


        int [][] num= new int[2][3];

        System.out.println("Enter elements for num:");
        for(int i=0; i<2;i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("num[" + i + "][" + j + "] = " + num[i][j]);
                num[i][j] = input.nextInt();
            }
        }

        System.out.println();


        int [][] num2= new int[2][3];

        System.out.println("Enter elements for num2:");
        for(int i=0; i<2;i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("num2[" + i + "][" + j + "] = " + num2[i][j]);
                num2[i][j] = input.nextInt();
            }
        }

        System.out.println();


        for(int i=0; i<2;i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("\t "+num[i][j]);
            }
            System.out.println();
        }


        System.out.println();


        for(int i=0; i<2;i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("\t "+num2[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Addition: num + num2");
        for(int i=0; i<2;i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("\t "+(num[i][j]  +  num2[i][j]));
            }
            System.out.println();
        }


    }
}
