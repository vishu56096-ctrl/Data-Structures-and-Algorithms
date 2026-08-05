import java.util.*;

public class LargestSmallest{
    public static void LargestSmallest(int nums[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){

            if(nums[i] > largest){
                largest = nums[i];
            }if(nums[i]<smallest){
                smallest = nums[i];
            }
           }
        System.out.println(largest+ " " + smallest);
    }
    public static void main(String[] args) {
        int nums[] = {21, 8, 9, 5, 7, 3, 8, 6, 7};
        LargestSmallest(nums);
    }
}