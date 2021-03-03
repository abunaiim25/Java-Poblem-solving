package com.company;

public class Main {

        public static void main(String[] args)
        {

            int[][] arr = { { 10, 20,30 }, { 40,50,60 } };

            for (int i = 0; i < 2; i++)
                for (int j = 0; j < 3; j++)

                    System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
        }
    }