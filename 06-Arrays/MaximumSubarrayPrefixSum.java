public class MaximumSubarrayPrefixSum{
    public static void MaximumSubarrayPrefixSum(int number[]){
        int currentSum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        // calculate prefix Array
        prefix[0] = number[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + number[i];
        }

        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                    int end = j;
                    currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                    if(maxsum < currentSum){
                        maxsum = currentSum;
                    }
            }
            
        
        }
        System.out.println("maxSum = " + maxsum);

    }
    public static void main(String[] args) {
        int number[] = {1, 5, -8, 5, 9};
        MaximumSubarrayPrefixSum(number);

    }
}