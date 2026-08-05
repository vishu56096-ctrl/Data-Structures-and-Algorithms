public class SecondLargest{
public static void SecondLarger(int nums[]){
          int largest = Integer.MIN_VALUE;
          int SecondLargest = Integer.MIN_VALUE;

          for(int i=0; i<nums.length; i++){
               if(nums[i] > largest){
                  SecondLargest = largest;
                  largest = nums[i];
               }
               else if (nums[i] > SecondLargest && nums[i] != largest){
                  SecondLargest = nums[i];
               }
          }
          System.out.println("SecondLargest  : " + SecondLargest);
          System.out.println("largest  : " + largest);
}

     public static void main(String[] args) {
         int nums[] = {21, 8, 9, 5, 7, 3, 8, 6, 7};
        SecondLarger(nums);
     }
}
