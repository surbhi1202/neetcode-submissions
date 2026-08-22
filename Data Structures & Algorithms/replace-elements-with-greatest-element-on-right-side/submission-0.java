class Solution {
    public int[] replaceElements(int[] arr) {
        int temp[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int min = -1;
            if(i == arr.length-1){
                temp[arr.length-1] = min;
            }
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] >min){
                     min = arr[j];
                    temp[i] = min;
                }
            }
        }
        return temp;
    }
}