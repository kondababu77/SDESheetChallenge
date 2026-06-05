public class KadanesAlgorithm {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            currentSum += nums[i];
            max = Math.max(max,currentSum);
            if(currentSum < 0) currentSum = 0;
        }
        return max;
    }
} 
