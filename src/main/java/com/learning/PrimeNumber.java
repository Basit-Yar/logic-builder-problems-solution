package com.learning;

public class PrimeNumber {

    public static void isPrimeNumber(int num) {
        if(num<2)
            throw new RuntimeException("Number should be natural.\nPrime numbers are only found in natural numbers.");

        boolean isPrime = true;
        for(int i=2; i<num; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(num + " : is a prime number.");
        else
            System.out.println(num + " : is not a prime number.");
    }
}
