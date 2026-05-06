# Solving-Problem-Harshad-Number-Challenge

class Solution {

    public int sumOfTheDigitsOfHarshadNumber(int x) {

        int original = x;
        int sum = 0;

        // Find sum of digits
        while (x > 0) {
            int digit = x % 10;
            sum += digit;
            x = x / 10;
        }

        // Check if Harshad number
        if (original % sum == 0) {
            return sum;
        }

        return -1;
    }
}

**Harshadnumber in java

import java.util.Scanner;

public class Harshad {

    // Function to calculate sum of digits
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Function to check Harshad number
    public static boolean isHarshad(int n) {
        int sum = digitSum(n);
        return n % sum == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isHarshad(n)) {
            System.out.println(n + " is a Harshad Number");
        } else {
            System.out.println(n + " is NOT a Harshad Number");
        }
    }
}
