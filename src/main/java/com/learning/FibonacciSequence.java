package com.learning;

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

        // TODO: 6/22/2024 : find the no. of term in sequence ==> 200
        System.out.println("==================================\n");
        int fibonacciNumAtTerm = 12;
        int fibNum = getFibonacciNum(fibonacciNumAtTerm);
        System.out.println(fibNum);
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
