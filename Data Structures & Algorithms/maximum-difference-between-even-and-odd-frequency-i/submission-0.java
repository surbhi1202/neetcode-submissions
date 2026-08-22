class Solution {
    public int maxDifference(String s) {
       int ar[] = new int[26];
       for(int i=0; i<s.length(); i++){
        ar[s.charAt(i)-'a']++;
       } 
       int o = Integer.MIN_VALUE;
       int e = Integer.MAX_VALUE;

       for(int ss: ar){
        if(ss>0){
            if(ss%2 ==0){
                e = Math.min(e,ss);
            }else{
                o = Math.max(o,ss);
            }
        }
       }
       return o-e;
    }
}