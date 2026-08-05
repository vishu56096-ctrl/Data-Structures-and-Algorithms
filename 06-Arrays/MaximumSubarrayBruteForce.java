public class MaximumSubarrayBruteForce{
    public static void maxSubArray(int num[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                currentSum = 0;
                for(int k=start; k<=end; k++ ){
                    currentSum += num[k];
                }
                if(maxSum<currentSum){
                    maxSum = currentSum;

                }
            }
        }
        System.out.println("arrays MaximumSubarray : " + maxSum);
    }
    public static void main(String [] args){
          int num[] = {2, -3, 4, -1, -2, 1, 5, -3};
          maxSubArray(num);
    }
}