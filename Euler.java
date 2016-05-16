import com.sun.tools.javac.code.Attribute;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by alikhan on 5/8/16.
 */
//link to function descriptions: https://projecteuler.net/archives
public class Euler {
    /*
    finds the sum of all numbers between 0 and 1000 that are multiples of 3 or 5
     */
    public static int multiplesOf3or5() {
        ArrayList<Integer> storeValues = new ArrayList<Integer>();
        int i;
        int sum = 0;
        for (i = 0; i < 1000; i++) {
        if (i % 3 == 0 || i % 5 == 0)
            storeValues.add(i);
        }
        for (i = 0; i < storeValues.size(); i++) {
            sum += storeValues.get(i);
        }
        return sum;
    }
    /*
    Finds the sum of the even Fibonacci numbers from 1 to 4000000
     */
    public static int evenFibonacciNumbers() {
        ArrayList<Integer> storeValues = new ArrayList<Integer>();
        int i = 0, sum = 0, n = 1, minusOne = 0, minusTwo = 1;
        storeValues.add(minusOne);
        storeValues.add(minusTwo);
       while (n < 4000000) {
            n = minusOne + minusTwo;
            minusTwo = minusOne;
            minusOne = n;
            if (n % 2 == 0)
                storeValues.add(n);
        }
        for (i = 0; i < storeValues.size(); i++) {
            sum += storeValues.get(i);
        }
        return sum;
    }

    /*
    Finds the largest prime of 600851475143
     */
    public static long largestPrimes() {
        long num = 600851475143L;
        long largest = 0L;
        long i = 2L;
        while (i <= Math.sqrt(num)) {
            if (num % i == 0) {
                num /= i;
                largest = i;
            }
            else
                i++;
        }
        if (num > largest)
            largest = num;
        return largest;
    }
    //checks to see if a number is a palindrome
    public static boolean isPalindrome(int x) {
        int num = x;
        int backwards = 0;
        while (num > 0) {
        int rem = num % 10;
            backwards = backwards * 10 + rem;
             num = num / 10;
        }
    if (x == backwards)
        return true;
        else
        return false;
    }
    public static int largestPalindromeProduct() {
        int i;
        int j;
        int largest = 0;
        for (i = 100; i < 1000; i++) {
            for (j = 100; j < 1000; j++) {
                int q = i * j;
                if (isPalindrome(q))
                    largest = q;
            }
        }
        return largest;
    }
    /*
    Finds the first integer that is evenly divisible by the natural numbers from 1 through 20
     */
    public static int smallesttMultiple() {
    int i = 1;
    int k = 1;
    int count = 0;
        while (i < Integer.MAX_VALUE) {
            if (i % k == 0) {
                k++;
                count++;

            }
            else
            {
                i++;
                k = 1;
                count = 0;
            }
            if (count == 20)
                break;
        }
        return i;
    }
    /*
    finds the difference of square of the sum of the first 100 natural numbers and the sum of the first 100 natural numbers squared.
     */
    public static int squareDifference() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += Math.pow(i, 2);
        }
        int square = 0;
        for (int j = 0; j <= 100; j++) {
            square += j;
        }
        double x = sum - Math.pow(square, 2);
        return -(int) x;

    }
    public static boolean isPrime(int x) {
        for (int i = 2; i <= (int) Math.sqrt(x); i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
    //finds the 10001st prime number
    public static int prime() {
        int count = 0;
        int i = 2;
        while (count <= 10001) {
            if (isPrime(i)) {
                count++;
            }
            if (count == 10001)
                break;
            i++;
        }
        return i;
    }
    //finds the product of the only 3 numbers, a, b, and c, that sum up to 1000
    public static int pythagorean() {
        int a, b, c, product = 0;
        for (a = 0; a < 1000 / 3; a++) {
            for (b = 0; b < 1000 / 2; b++) {
                c = 1000 - (b + a);
                if (c > 0 && (Math.pow(a, 2) + Math.pow(b,2) == Math.pow(c, 2))) {
                     product = a * b * c;
                }
            }
        }
        return product;
    }
    public static int sumOfPrimes() {
        int i = 2, sum = 0;
        while (i <= 2000000) {
            if (isPrime(i)) {
                sum += i;
            }
            i++;
        }
        return sum;
    }
    /*
    Simple print statement that is used to display what each of the methods returns
     */
    static void printer(long x) {

        System.out.println("Answer: " + x );
    }
    public static void main(String[] args) {
        printer(multiplesOf3or5());
        printer(evenFibonacciNumbers());
        printer(largestPrimes());
        printer(largestPalindromeProduct());
        printer(smallesttMultiple());
        printer(squareDifference());
        printer(prime());
        printer(pythagorean());
        printer(sumOfPrimes());
    }
}
