package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter 5 numbers: ");

        double[] number = new double[5];

        double sum = 0;

       /*
       number[0]= input.nextDouble();
        number[1]= input.nextDouble();
        number[2]= input.nextDouble();
        number[3]= input.nextDouble();
        number[4]= input.nextDouble();
        double sum = number[0]+number[1]+number[2]+number[3]+number[4];
         System.out.println("Sum = "+sum);
        */

        for (int i = 0; i < 5; i++)
        {
            number[i] = input.nextDouble();
        }
        for (int i = 0; i < 5; i++)
        {
            sum = sum + number[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + sum / 5);



        double max = number[0];
        double min = number[0];

        for(int i=1; i < 5; i++)
        {
            if (max < number[i])
            {
                        max = number[i];
            }
            if (min > number[i])
            {
                min = number[i];
            }
        }

        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);

    }
}
