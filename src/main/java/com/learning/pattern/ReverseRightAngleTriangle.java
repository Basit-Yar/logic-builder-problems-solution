package com.learning.pattern;

public class ReverseRightAngleTriangle {

    public void printPattern() {

//                *
//              * *
//            * * *
//          * * * *
//        * * * * *

//        for(int i=1; i<=5; i++) {
//            for(int j=1; j<=5; j++) {
//                if(i+j>5)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }

        int n = 5;
        for (int i= 1; i<=n; i++) {
            for (int j=i; j<=n; j++) {
                System.out.print("  ");
            }

            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
