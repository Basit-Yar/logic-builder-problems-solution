package com.learning;

public class Anagram {
    public static void main(String[] args) {
        String string1 = "silent";
        String string2 = "listEn";

        boolean isAnagram = isAnagram(string1, string2);
        if(isAnagram)
            System.out.println("These strings are Anagram.");
        else
            System.out.println("These string are not Anagram.");
    }

    public static boolean isAnagram(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length())
            return false;

        String sortedStr1 = sortString(str1);
        String sortedStr2 = sortString(str2);
        if(sortedStr1.equals(sortedStr2))
            return true;
        else
            return false;
    }

    public static String sortString(String str) {
        char[] arr = str.toCharArray();

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr.length-1; j++){

                if (arr[j] > arr[j+1]) {
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        String sortedString = new String(arr);
        System.out.println("sorted string of : " + str + " is : " + sortedString);
        return sortedString;
    }
}
