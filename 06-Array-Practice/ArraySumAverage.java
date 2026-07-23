public class ArraySumAverage{
    public static void ArrySumAverage(int nums[]){

        int sum = 0;
        for(int i=0; i< nums.length ; i++){
             sum = sum + nums[i];
        }
        System.out.print(sum/nums.length);
    }
    public static void main (String[] args){
        int nums[] = {21, 8, 9, 5, 7, 3, 8, 6, 7};

        ArrySumAverage(nums);
    }
}
