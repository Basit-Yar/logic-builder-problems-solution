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
        System.out.println("==================================\n");
        int fibonacciNumAtTerm = 12;
        int fibNum = getFibonacciNum(fibonacciNumAtTerm);
        System.out.println(fibNum);

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

    private static int getFibonacciNum(int n) {

        if(n==1)
            return 1;
        else if(n==0)
            return 0;
        else
            return getFibonacciNum(n-1) + getFibonacciNum(n-2);
    }
}
