import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer ,Integer> hm=new HashMap<>();
        for(int n:nums){
            hm.put(n,8);
        }
        for(int i=1;i<=100001;i++){
            if(!hm.containsKey(i))
                return i;
        }
        return -1;
    }
}