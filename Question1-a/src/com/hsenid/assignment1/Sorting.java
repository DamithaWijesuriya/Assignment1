package com.hsenid.assignment1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hsenid on 9/30/16.
 */
public class Sorting {
    public static void main(String[] args) {


        Sorting();
    }

    /**
     * Sorting()
     * <p>
     * In here we can get the Key board inputs and make them Ascending Order or Descending Order
     * User can see the Ascending Order and  Descending Order individually
     * User have to give key board input by giving the enter and line by line
     */
    public static void Sorting() {
        int myint = 0;
        for (int p = 0; ; p++) {
            Scanner keyboard = new Scanner(System.in);
            while (true) {
                System.out.print("Enter How Many Inputs: ");
                String input = keyboard.next();
                if (input.matches("^\\d+$")) {
                    myint = Integer.parseInt(input);
                    break;
                }
                System.out.println("Invalid input! Should be an integer!");
            }

            int arr[] = new int[myint];

            for (int j = 0; j < myint; j++) {
                while (true) {
                    System.out.print("Enter Value :");
                    String str = keyboard.next();
                    if (str.matches("^\\d+$")) {
                        arr[j] = Integer.parseInt(str);
                        break;
                    }
                    System.out.println("Invalid number!");
                }
            }

            Scanner keyboard3 = new Scanner(System.in);
            System.out.println("Output in horizontal Enter 1 or Output in vertical Enter 0 ");
            int Pattern = keyboard3.nextInt();

            Scanner keyboard2 = new Scanner(System.in);
            System.out.println("Ascending Order Enter 3 or Descending Order Enter 2: ");
            int virsion = keyboard2.nextInt();

            if (Pattern == 1) {
                if (virsion == 3) {
                    System.out.println("Numbers in Ascending Order:");

                    for (int k = 0; k < arr.length; k++) {
                        if (k != arr.length - 1) {
                            Arrays.sort(arr);
                            System.out.print(" " + arr[k] + ",");
                        } else {
                            Arrays.sort(arr);
                            System.out.print(" " + arr[k]);
                        }
                    }
                } else if (virsion == 2) {
                    System.out.println();
                    Arrays.sort(arr);
                    System.out.println("Numbers in Descending Order: ");

                    for (int i = arr.length - 1; i >= 0; i--) {
                        if (i != 0)
                            System.out.print(" " + arr[i] + ",");
                        else
                            System.out.print(" " + arr[i]);
                    }
                    System.out.println(" ");
                } else {
                    System.out.println("Invalid Input Try again");
                }
            }
            if (Pattern == 0) {
                if (virsion == 3) {
                    System.out.println("Numbers in Ascending Order:");

                    for (int k = 0; k < arr.length; k++) {
                        if (k != arr.length - 1) {
                            Arrays.sort(arr);
                            System.out.print(" " + arr[k] + ",");
                        } else {
                            Arrays.sort(arr);
                            System.out.print(" " + arr[k]);
                        }
                    }
                } else if (virsion == 2) {
                    System.out.println();
                    Arrays.sort(arr);
                    System.out.println("Numbers in Descending Order: ");

                    for (int i = arr.length - 1; i >= 0; i--) {
                        if (i != 0)
                            System.out.print(" " + arr[i] + ",");
                        else
                            System.out.print(" " + arr[i]);
                    }
                    System.out.println(" ");
                } else {
                    System.out.println("Invalid Input Try again");
                }
            }

            System.out.println();
            Scanner endCommand = new Scanner(System.in);
            System.out.println("Do you want Continue ? (Y,N)");
            String command = endCommand.nextLine();
            if (command.equals("N")) {
                break;
            } else if (command.equals("Y"))
                continue;
            else
                System.out.println("Not a valid command, please type Y or N." + command);


        }

    }
}






