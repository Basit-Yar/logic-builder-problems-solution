package com.learning.sorting;

public class BubbleSort {

    public BubbleSort() {

    }

    public int[] sortArrayUsingBubbleSortAlgo (int[] arr) {
        if (arr.length == 0){
            arr = new int[] {4, 8, 2, 16, 9, 1, 0, 9, 13, 8};
        }

        for(int i=0; i < arr.length; i++) {

            for (int j=0; j < arr.length-1; j++) {

                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
