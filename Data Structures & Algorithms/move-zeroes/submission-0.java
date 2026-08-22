class Solution {
    public void moveZeroes(int[] nums) {
        int l = nums.length;
        int idx =0;
        for(int i=0; i<l; i++){
            if(nums[i] !=0){
                nums[idx++] = nums[i];
            }
        }
        while(idx<l){
            nums[idx++] =0;
        }
    }
}