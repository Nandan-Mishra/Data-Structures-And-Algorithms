class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            runningSum[i]=runningSum[i-1]+nums[i];
        }
        return runningSum;
    }
}



/* #Another Solution solving using nums array only

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<=nums.length-1;i++){
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;

    }
}
*/