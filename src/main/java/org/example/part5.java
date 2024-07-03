package org.example;

import java.util.Scanner;

public class part5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your score please: ");
        int x = scanner.nextInt();
        System.out.println("You scored: " + x +". So your grade is :  ");
        if (x < 60) {
            System.out.println("F");
        } else if (x>=60 & x <=69){
            System.out.println("D");
        }
        else if (x>=70 & x <=79){
            System.out.println("C");
        }
        else if (x>=80 & x <=89){
            System.out.println("B");
        }
        else if (x>=90 & x <=100){
            System.out.println("A");

        }
        scanner.close();
    }
}
