package com.learning.pattern;

import java.util.Scanner;

public class Pattern05 {

    public static void main(String[] args) {

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

        Scanner scan = new Scanner(System.in);
        System.out.println("please Enter the positive odd no. for row : ");
        int totalRows = scan.nextInt();
        if (totalRows % 2 == 0)
            throw new RuntimeException("Please give rows no. in odd!");

        int rows = totalRows/2;

        for(int i=1; i <= rows + 1; i++){

            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i= rows; i>=1; i--){
            for (int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
