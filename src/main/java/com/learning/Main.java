package com.learning;

import com.learning.pattern.InvertedRightAngleTriangle;
import com.learning.pattern.ReverseInvertedRightAngleTriangle;
import com.learning.pattern.ReverseRightAngleTriangle;
import com.learning.pattern.RightAngleTriangle;
import com.learning.sorting.BubbleSort;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {

    public static void main(String[] args) {

//        System.out.println("========================");
//        BubbleSort bubbleSortObj = new BubbleSort();
//        int[] sortedArray = bubbleSortObj.sortArrayUsingBubbleSortAlgo(new int[]{});
//        for (int i : sortedArray) {
//            System.out.print(i + ", ");
//        }
//        System.out.println("\n========================");


        System.out.println("=========== Pattern ============\n");

//        RightAngleTriangle rightAngleTriangle = new RightAngleTriangle();
//        rightAngleTriangle.printPattern();

//        InvertedRightAngleTriangle invertedRightAngleTriangle = new InvertedRightAngleTriangle();
//        invertedRightAngleTriangle.printPattern();

//        ReverseRightAngleTriangle reverseRightAngleTriangle = new ReverseRightAngleTriangle();
//        reverseRightAngleTriangle.printPattern();

//        ReverseInvertedRightAngleTriangle p4 = new ReverseInvertedRightAngleTriangle();
//        p4.printPattern();
//
//        System.out.println("\n===============================");

        System.out.println("================ Basic Questions ===============");
        boolean isArmNum = ArmstrongNumber.isArmstrongNumber(370);
        System.out.println("Armstrong Number : " + isArmNum);
        System.out.println("================================================");
    }
}