public class ReverseArray{
    public static void ReverseArray(int nums []){
        int[] reverse = new int[nums.length];

        int j = 0;
        for(int i=nums.length - 1; i>=0; i-- ){
            reverse[j] = nums[i];
            j++;
        }
        System.out.println("reverse arry ");
        for(int i=0; i < reverse.length; i++){
            System.out.print(reverse[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] nums = {10, 20, 30, 40, 50};
        ReverseArray(nums);
    }
}


// This version reads from the last index to the first index.
