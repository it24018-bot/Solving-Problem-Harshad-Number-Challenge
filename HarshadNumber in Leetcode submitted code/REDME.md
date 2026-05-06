class Solution {



&#x20;   public int sumOfTheDigitsOfHarshadNumber(int x) {



&#x20;       int original = x;

&#x20;       int sum = 0;



&#x20;       // Find sum of digits

&#x20;       while (x > 0) {

&#x20;           int digit = x % 10;

&#x20;           sum += digit;

&#x20;           x = x / 10;

&#x20;       }



&#x20;       // Check if Harshad number

&#x20;       if (original % sum == 0) {

&#x20;           return sum;

&#x20;       }



&#x20;       return -1;

&#x20;   }

}

