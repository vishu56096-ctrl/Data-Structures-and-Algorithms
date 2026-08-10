public class MaximumSubarrayKadane {
    public static void MaximumSubarrayKadane(int nums[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            currentSum = currentSum + nums[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println("max sum is " + maxSum);
        
    }
    public static void main(String[] args){
      int nums[] = {-1, 8, 3, 7, -5, -6, -5};
      MaximumSubarrayKadane(nums);
    }
}

// Kadane's Algorithm finds the maximum sum of a contiguous subarray.
// It keeps track of the current sum and the maximum sum found so far.
// Time Complexity: O(n), Space Complexity: O(1).
