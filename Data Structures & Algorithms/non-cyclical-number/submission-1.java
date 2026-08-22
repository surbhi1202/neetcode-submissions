public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> map = new HashSet<>();

        while (!map.contains(n)) {
            map.add(n);
            n = sumOfSquares(n);
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

    private int sumOfSquares(int n) {
        int output = 0;

        while (n > 0) {
            int digit = n % 10;
            digit = digit * digit;
            output += digit;
            n /= 10;
        }
        return output;
    }
}