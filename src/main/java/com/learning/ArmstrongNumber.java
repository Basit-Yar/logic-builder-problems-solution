package com.learning;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {

    public static boolean isArmstrongNumber(int num){

//        int tempNum = num;
//        int digits=0;
//        for(digits=0; tempNum>=1; digits++) {
//            tempNum=tempNum/10;
//        }
//
//        tempNum = num;
//        int sum=0;
//
//        for(int i=1; i<=digits; i++) {
//            int r = tempNum % 10;
//            sum += Math.pow(r, digits);
//            tempNum /=10;
//        }
//
//        if(num == sum)
//            return true;
//        else
//            return false;

        // =========================== BY DIFFERENT APPROACH

        int originalNum = num;
        int len = String.valueOf(num).length();
        int sum = 0;

        for(int i=0; num>=1; i++) {
            int r = num % 10;
            num /= 10;
            sum += Math.pow(r, len);
        }
        System.out.println("original no. is : " + originalNum);
        System.out.println("Total sum of it as armstrong : " + sum);

        if(originalNum == sum)
            return true;
        else
            return false;
    }

    public static List<Integer> printArmstrongNumberBetweenRange(int from, int to){

         List<Integer> armstrongNumbers = new ArrayList<>();

         for(int i=from; i<=to; i++){
             int number = i;

             int temp = i;
             int len = 0;
             while(temp != 0){
                 temp /= 10;
                 len++;
             }

             int sum = 0;
             while(number >=1) {
                 int r = number % 10;
                 sum += Math.pow(r, len);
                 number /= 10;
             }

             if(i == sum)
                 armstrongNumbers.add(i);
         }

        return armstrongNumbers;
    }
}
