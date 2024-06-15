package com.learning;

public class ArmstrongNumber {

    public static boolean isArmstrongNumber(int num){
        int tempNum = num;
        int digits=0;
        for(digits=0; tempNum>=1; digits++) {
            tempNum=tempNum/10;
        }
        tempNum = num;
        int sum=0;
//        System.out.println("total digits in " + num + " is : " + digits) ;
        for(int i=1; i<=digits; i++) {
            int r = tempNum % 10;
            sum += Math.pow(r, digits);
            tempNum /=10;
        }

        if(num == sum)
            return true;
        else
            return false;
    }
}
