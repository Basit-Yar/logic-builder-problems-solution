package com.learning.pattern;

public class RightAngleTriangle {
    public void printPattern() {
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
