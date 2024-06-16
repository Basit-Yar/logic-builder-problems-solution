package com.learning;

import java.util.ArrayList;
import java.util.List;

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

    public static List<Integer> findPrimeNumbersInRange (int from, int to) {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int i=from; i<=to; i++) {

            boolean isPrime = true;
            for(int j=2; j<i; j++){
                if(i % j == 0){
                    isPrime=false;
                    break;
                }
            }
            if(i<2){}
            else if (isPrime)
                primeNumbers.add(i);

        }

        return primeNumbers;
    }
}
