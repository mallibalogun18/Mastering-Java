package com.moh.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("Hello World!");
        welcomeMessage("James Brown");

        //call method monthSelector and Use the
        //Scanner class to interact with the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a number from 1 to 12");
        try {
            int number = scanner.nextInt();
            monthSelector(number);
        }catch (InputMismatchException ime){
            System.out.println("You inserted a value that is not an" +
                    " Integer.");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void welcomeMessage(String name){
        System.out.println("Welcome to our Java Program "+name+"!!");
    }

    public static void monthSelector(int month){
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println("You selected " +
                "the month of "+monthString+".");
    }
}
