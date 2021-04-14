
package com.company;

import java.util.Scanner;


public class Main {

    public static double mainMenu;
    public static double orderPoint;
    public static double aboutUs;


    static Scanner input = new Scanner(System.in);


    public static double mainMenu() {

        int choice;
        choice = input.nextInt();

        if (choice == 1) {
            orderPoint();
        } else if (choice == 2) {
            aboutUs();
        }

        return mainMenu;
    }


    private static double orderPoint() {

        int choice;
        int again;
        int quantity;
        double price = 0;
        double total = 0;


        System.out.println("\n\n\n*****  OTHER MENU  *****\n\n");
        System.out.println("1. Fish             300/-\n2. Rice             50/-\n3. Chicken          180/-\n4. Meat             600/-\n5. Mango            120/-\n\n\nEnter Your Choice ---> ");

        System.out.print("What you want : ");
        choice = input.nextInt();
        int ttl;


        if (choice == 1) {
            System.out.print("Quantity : ");
            quantity = input.nextInt();
            total = total + 300 * (quantity);
            System.out.println();
            System.out.println("--> Press 1 To Get Your Total \n--> Pressing everything except 1 will move to the OTHER MENU ");
            System.out.print("Enter Your Choice ---> ");
            again = input.nextInt();
            if (again == 1) {
                System.out.println("Your Total Amount Is : " + total + " TK");
                int totl = (int) total;
            } else {
                orderPoint();
            }
        }

        if (choice == 2) {
            System.out.print("Quantity : ");
            quantity = input.nextInt();
            total = total + 50 * (quantity);
            System.out.println();
            System.out.println("--> Press 1 To Get Your Total \n--> Pressing everything except 1 will move to the OTHER MENU ");
            System.out.print("Enter Your Choice ---> ");
            again = input.nextInt();
            if (again == 1) {
                System.out.println("Your Total Amount Is : " + total + " TK");
                int totl = (int) total;
            } else {
                orderPoint();
            }
        }

        if (choice == 3) {
            System.out.print("Quantity : ");
            quantity = input.nextInt();
            total = total + 180 * (quantity);
            System.out.println();
            System.out.println("--> Press 1 To Get Your Total \n--> Pressing everything except 1 will move to the OTHER MENU ");
            System.out.print("Enter Your Choice ---> ");
            again = input.nextInt();
            if (again == 1) {
                System.out.println("Your Total Amount Is : " + total + " TK");
                int totl = (int) total;
            } else {
                orderPoint();
            }
        }

        if (choice == 4) {
            System.out.print("Quantity : ");
            quantity = input.nextInt();
            total = total + 600 * (quantity);
            System.out.println();
            System.out.println("--> Press 1 To Get Your Total \n--> Pressing everything except 1 will move to the OTHER MENU ");
            System.out.print("Enter Your Choice ---> ");
            again = input.nextInt();
            if (again == 1) {
                System.out.println("Your Total Amount Is : " + total + " TK");
                int totl = (int) total;
            } else {
                orderPoint();
            }
        }

        if (choice == 5) {
            System.out.print("Quantity : ");
            quantity = input.nextInt();
            total = total + 120 * (quantity);
            System.out.println();
            System.out.println("--> Press 1 To Get Your Total \n--> Pressing everything except 1 will move to the OTHER MENU ");
            System.out.print("Enter Your Choice ---> ");
            again = input.nextInt();
            if (again == 1) {
                System.out.println("Your Total Amount Is : " + total + " TK");
                int totl = (int) total;
            } else {
                orderPoint();
            }
        }
        return mainMenu();
    }



        private static void aboutUs () {
            System.out.println("PEOPLE BEHIND THIS PROJECT :\n");
            System.out.println(" --> Abu Naiim");
            System.out.println(" --> Sallauddin Emon");
            System.out.println(" --> Jannati Tayeba");
            System.out.println(" --> Md. Tahmid");
            System.out.println("");
            System.out.println("**THANK YOU**");


        }


        public static void main(String[] args){
            //system("cls");
            System.out.println("\n\n*****  WELCOME TO AgroBd  *****\n");
            System.out.println("          1. ORDER POINT \n\n          2. ABOUT US \n\n     ");
            System.out.print(" Enter Your Choice ---> ");


            int Home;
            input = new Scanner(System.in);
            Home = input.nextInt();
            switch (Home) {

                case 1:
                    mainMenu = 1;
                    orderPoint();
                    break;
                case 2:
                    mainMenu = 2;
                    aboutUs();
                    break;

                default:
                    System.out.println("Invalid option.");
            }


        }
    }
