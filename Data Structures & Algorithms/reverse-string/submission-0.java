class Solution {
    public void reverseString(char[] s) {
        int f =0;
        int e =s.length-1;
        while(f<=e){
            char temp = s[e];
            s[e] = s[f];
            s[f] = temp;
            f++;
            e--;
        }
        
    }
}