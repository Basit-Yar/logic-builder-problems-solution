package com.learning;

import com.learning.pattern.InvertedRightAngleTriangle;
import com.learning.pattern.ReverseRightAngleTriangle;
import com.learning.pattern.RightAngleTriangle;
import com.learning.sorting.BubbleSort;

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

        ReverseRightAngleTriangle reverseRightAngleTriangle = new ReverseRightAngleTriangle();
        reverseRightAngleTriangle.printPattern();

        System.out.println("\n===============================");
    }
}