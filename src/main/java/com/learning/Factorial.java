package com.learning;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("please Enter the number : ");
        int num = scan.nextInt();
        int factorial = 1;

        for(int i=num; i>=1; i--){
            factorial *= i;
        }
        System.out.println("The factorial of "+ num + " is : " + factorial);
    }
}
