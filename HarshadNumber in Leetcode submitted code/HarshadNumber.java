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