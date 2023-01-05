package org.example;
//  Sum square difference
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class Problem6 {
    public static void main(String[] args) {
        int sum = 0;
        int squares = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            squares += i*i;
        }

        sum = sum * sum;
        System.out.println(sum - squares);
    }
}
