package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);

        int[][] A= new int [3][3];

        int sumOfDiagonalElements =0;
        int sumOfUpperElements =0;
        int sumOfLowerElements =0;

//matrix input
        for (int row=0; row<3; row++){
            for (int col=0; col<3; col++){

                A[row][col]=input.nextInt();
            }
        }

//diagonal,upper,lower
        for (int row=0; row<3; row++){
            for (int col=0; col<3; col++){

                if (row==col)  //diagonal
                {
                    sumOfDiagonalElements = sumOfDiagonalElements + A[row][col];
                }
                if (row<col)  //upper
                {
                    sumOfUpperElements = sumOfUpperElements + A[row][col];
                }
                if (row>col)  //lower
                {
                    sumOfLowerElements = sumOfLowerElements + A[row][col];
                }

            }
        }

        System.out.println("Sum of diagonal element : "+sumOfDiagonalElements);
        System.out.println("Sum of upper element : "+sumOfUpperElements);
        System.out.println("Sum of lower element : "+sumOfLowerElements);

    }
}
