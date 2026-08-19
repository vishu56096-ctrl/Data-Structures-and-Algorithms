public class MajorityElement{
    public static int MajorityElement(int[] nums){

        for(int i=0; i<nums.length; i++){
            int frequency = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    frequency ++;
                }
            }
           if(frequency > nums.length / 2){
                return nums[i];
            }
             
        }
        return -1;
    
    }
    public static void main(String[] args) {
        int nums[] = {1, 5, 5, 5, 5, 5, 5, 2, 3, 4, 6};
       System.out.println( MajorityElement(nums)); 
    }
}
///I take each element one by one using the outer loop. Then I use the inner loop to count how many times that element occurs. If its frequency is greater than n/2, I return that element as the majority element. If no element satisfies the condition, I return -1/