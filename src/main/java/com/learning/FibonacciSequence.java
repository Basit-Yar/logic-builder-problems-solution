package com.learning;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        int n = 10;
        int t1 = 0;
        int t2 = 1;
        int nextTerm=0;

        for(int i=0+2; i<=n; i++) {
            nextTerm = t1 + t2;
            System.out.println("Term : " + i + " is = " + nextTerm);
            t1 = t2;
            t2 = nextTerm;
        }
        System.out.println("final : " + nextTerm);
        System.out.println("=========================================\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value to get the sequence of fibonacci series under : ");
        int range = scan.nextInt();
        getFibonacciSeriesUnderRange(range);
        // TODO: 6/22/2024 : fibonacci sequence using recursion 
        
    }

    public static void getFibonacciSeriesUnderRange(int range){
        int t1 = 0;
        int t2 = 1;
        int nextTerm = 0;

        System.out.print(t1 + ", " + t2);

        while(true){
            nextTerm = t1 + t2;
            if(nextTerm > range)
                break;
            System.out.print(", " + nextTerm);
            t1 = t2;
            t2 = nextTerm;
        }
    }
}
