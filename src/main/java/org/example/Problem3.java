package org.example;

public class Problem3 {
//    The prime factors of 13195 are 5, 7, 13 and 29.
//
//    What is the largest prime factor of the number 600851475143 ?

    public static void main(String[] args) {
        final long number = 600851475143L;

        for (long i = 2; i < number / 2; i++) {
            if (number % i == 0 && isPrime(number / i)) {
                System.out.println(number / i);
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
