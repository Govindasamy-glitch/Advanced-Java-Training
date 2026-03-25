class Solution {
    public int[] FirstAndLastPosition(int[] nums, int target) {
        int first=-1,last=-1;
        int[] arr={last,first};
        if(nums.length==0)
            return arr;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(first==-1){
                    first=i;
                }
                if(first!=-1){
                    last=i;
                }
                
            }
        }
        arr[0]=first;
        arr[1]=last;
        return arr;
    }
}