package org.example;
//  Special Pythagorean triplet
//  A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//        a2 + b2 = c2
//        For example, 32 + 42 = 9 + 16 = 25 = 52.
//
//        There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//        Find the product abc.

public class Problem9 {
    public static void main(String[] args) {
        double c = 0;
        for (double a = 1; a < 999; a++) {
            for (double b = 1; b < 999; b++) {
                c = Math.sqrt(a*a + b*b);
                if (c % 1 != 0) {
                    continue;
                }

                    if (a + b + c == 1000) {
                        System.out.println("a: " + a + " b: " + b + " c: " + c + " Product: " + a*b*c);
                        return;
                    }

            }
        }
    }
}
