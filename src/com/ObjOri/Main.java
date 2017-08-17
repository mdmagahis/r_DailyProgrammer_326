package com.ObjOri;

public class Main {

    public static void main(String[] args) {
        int[] challengeInput = {270, 541, 993, 649};
        for (int val:challengeInput){
            boolean isPrime = false;
            isPrime = checkPrime(val);

            if (isPrime){
                System.out.println(val + " is prime.");
            }
            else {
                int lessPrime = val;
                int morePrime = val;

                // Find nearest prime below val
                while (!isPrime) isPrime = checkPrime(--lessPrime);

                isPrime = false;

                // Find nearest prime above val
                while (!isPrime) isPrime = checkPrime(++morePrime);

                // Output for
                System.out.println(lessPrime + " < " + val + " < " + morePrime);
            }
        }
    }

    // Brute force check if a number is prime
    public static boolean checkPrime(int x){
        // x is one, two, or three
        if (x < 4 && x >= 0)    return true;

        // x is even
        else if (x % 2 == 0)    return false;

        // check every odd number up until (x/2)
        for (int y = 3; y < (x/2); y += 2) {
            if (x % y == 0)    return false;
        }

        // prime if you reach this point
        return true;
    }
}
