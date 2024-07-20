package com.learning;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 3, 5, 7};
        int k = 4;
        if(k > arr.length){
            k = k % arr.length;
        }
        printArray(arr);

        int len = arr.length;
        int[] rotatedArr = new int[len];
        for(int i=0; i<len; i++) {
            if (i+k < len)
                rotatedArr[i+k] = arr[i];
            else
                rotatedArr[i+k-len] = arr[i];
        }
        arr = rotatedArr;
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
}
