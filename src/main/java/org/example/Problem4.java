package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers
// is 9009 = 91 × 99.
//
// Find the largest palindrome made from the product of two 3-digit numbers.

public class Problem4 {
    public static void main(String[] args) {
        int n1 = 999;
        int n2 = 999;
        List<Integer> products = new ArrayList<>();
        for (int i = n1; i > 99; i--) {
            for (int j = n2; j > 99; j--) {
                int res = i * j;
                if (isPalindromic(res)) {
                    products.add(res);
                }
            }
        }

        int max = Collections.max(products);
        System.out.println(max);
    }

    public static boolean isPalindromic(int num) {
        String numStr = String.valueOf(num);
        String s1 = numStr.substring(0, numStr.length()/2);
        String s2 = numStr.substring(numStr.length()/2);
        StringBuilder sb = new StringBuilder(s1).reverse();
        if (sb.toString().equals(s2)) {
            return true;
        } else {
            return false;
        }
    }
}
