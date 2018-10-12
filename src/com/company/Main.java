package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private static ArrayList<perfectRandom> names = new ArrayList<>();
    private static Scanner strscan = new Scanner(System.in);

    public static void main(String[] args)
        {
            getEntry();
        }
    private static void prompt()
        {
            System.out.println("What would you like to do?\n0 to exit\n1 to get a listing of all entries\n2 to input an entry");
            switch (strscan.nextLine())
                {
                    case "0":
                        break;
                    case "1":
                        printout();
                        break;
                    case "2":
                        getEntry();
                        break;
                    default:
                        System.out.println("Invalid input.\nTry again later when you can follow directions.");
                        break;
                }
        }
    private static void getEntry()
        {
            System.out.println("Enter a name.");
            names.add(new perfectRandom(strscan.nextLine()));
            printout();
        }
    private static void printout()
        {
            for (int count = 0; count < names.size(); count++)
            {
                System.out.println("Hello " + names.get(count).getName() + ". Your lucky number is " + names.get(count).getLuckyNumber() + ".");
            }
            prompt();
        }
}
