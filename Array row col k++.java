package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //assignment the value to the the 2d array
        int[][] number = new int[4][5];

        int k=0;

        for (int i=0; i<4; i++)
        {
            for (int j=0; j<5; j++)
            {
                number[i][j]=k;
                k++;
            }
        }

        //printing the elements
        for (int i=0; i<4; i++)
        {
            for (int j=0; j<5; j++)
            {
                System.out.print(" "+number[i][j]);
            }
            System.out.println();
        }


    }

}
