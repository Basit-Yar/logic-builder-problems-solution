package com.learning.pattern;

public class ReverseInvertedRightAngleTriangle {

    public void printPattern() {

        int n=5;

//        * * * * *
//          * * * *
//            * * *
//              * *
//                *

//        for (int i=n; i>=1; i--) {
//            for (int j=1; j<=n; j++){
//                if(i+j<=n)
//                    System.out.print("  ");
//                else
//                    System.out.print(" *");
//            }
//            System.out.println();
//        }

        for (int i=1; i<=n; i++) {

            for(int j=1; j<i; j++){
                System.out.print("  ");
            }

            for(int j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
