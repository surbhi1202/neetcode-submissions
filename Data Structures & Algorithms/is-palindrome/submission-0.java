class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int f = 0;
        int l = s.length() - 1;

        while (f <= l) {
            if (s.charAt(f) != s.charAt(l)) {
                return false;
            }
            f++;
            l--;
        }
        return true;
    }
}
