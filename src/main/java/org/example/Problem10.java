package org.example;
//  Summation of primes
//  The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//  Find the sum of all the primes below two million.

public class Problem10 {


    public static void main(String[] args) {
        long sum = 0;
        boolean[] arr = new boolean[2_000_001];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }

        for (int i = 2; i*i < arr.length; i++) {
            if (arr[i] == false) {
                continue;
            }

            if (arr[i] == true) {
                for (int j = i*i; j < arr.length; j++) {
                    if (j % i == 0) {
                        arr[j] = false;
                    }
                }
            }

        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                sum += i;
            }
        }

        System.out.println(sum-1);


    }

}
