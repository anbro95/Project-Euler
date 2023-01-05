package org.example;
//  10001st prime
//  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//  What is the 10001st prime number?

public class Problem7 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; ; i++) {
            if (isPrime(i)) {
                count++;
            }

            if (count == 10001) {
                System.out.println(i);
                return;
            }
        }
    }

    public static boolean isPrime(long num) {
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
