import java.util.*;

public class SumEvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number : ");
        int number = sc.nextInt();

        int evensum = 0;
        int oddsum = 0;

        while(number > 0){
            int lastDigit = number % 10 ;

            if(lastDigit % 2 == 0){
                evensum = evensum + lastDigit;
            }else{
                oddsum = oddsum + lastDigit;
            }
            number = number / 10;
        }
        System.out.println("sum of even digit : " + evensum);
        System.out.println("sum of odd digit : " + oddsum);
    }
}
