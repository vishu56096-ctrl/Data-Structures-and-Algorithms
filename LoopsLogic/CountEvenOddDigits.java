import java.util.*;

public class CountEvenOddDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter number : ");
        int number = sc.nextInt();

        int odd = 0;
        int even = 0;

        while(number > 0){
            int lastDigit = number % 10;

            if(lastDigit % 2 == 0){
                even = even + 1;
            }else{
                odd = odd + 1;
            }
            number = number / 10;
        }
        System.out.println("even digits in number  : "+even);
        System.out.println("odd digits in number  :  "+odd);

    }
}