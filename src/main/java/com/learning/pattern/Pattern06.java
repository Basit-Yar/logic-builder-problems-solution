package com.learning.pattern;

import java.util.Scanner;

public class Pattern06 {

    public static void main(String[] args) {

//                *
//              * *
//            * * *
//          * * * *
//        * * * * *
//          * * * *
//            * * *
//              * *
//                *

        System.out.println("Please Enter the length and it should be odd : ");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        if (length % 2 == 0)
            throw new RuntimeException("Length should be odd!");

        for (int i = 1; i <= length / 2 + 1; i++) {

            for (int j = 1; j <= length / 2 + 1; j++) {

                if (i + j > length / 2 + 1) {

                    System.out.print(" *");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = length / 2; i >= 1; i--) {
            for (int j = 1; j <= length / 2 + 1; j++) {
                if (i + j <= length / 2 + 1)
                    System.out.print("  ");
                else
                    System.out.print(" *");
            }
            System.out.println();
        }
    }

}
