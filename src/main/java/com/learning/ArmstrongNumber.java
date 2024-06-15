package com.learning;

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
}
