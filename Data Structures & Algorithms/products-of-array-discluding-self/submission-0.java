class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] ans = new int[nums.length];
        int left = 1;
       for(int i = 0; i < nums.length; i++) {
        ans [i] = left;
        left = left*nums[i];
       }
       //[1,1,2,8]
       int right = 1;
       for (int i = nums.length-1; i>= 0; i--) {//2
        ans[i] *= right;
        right = right*nums[i];//6
       }
       return ans;
       //[,12,8]
    }
}  
