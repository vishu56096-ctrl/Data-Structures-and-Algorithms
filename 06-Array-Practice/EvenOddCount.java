import java.util.*;
public class EvenOddCount{
    public static void EvenOddCount(int nums[]){
           int evenCount = 0;
           int oddCount = 0;

           for(int i=0; i<nums.length; i++){
                 if(nums[i] % 2 == 0){
                    evenCount = evenCount + 1;
                 }else{
                    oddCount = oddCount + 1;
                 }
           }
           System.out.println("even digit count : " + evenCount);
           System.out.println("odd digit count : " + oddCount);
    }
    public static void main(String[] args){
        int nums[] = {4, 5, 8, 7, 9,5, 7, 8, 9};

        EvenOddCount(nums);

    }
}