import java.util.*;

public class PalindromeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number : ");
        int number = sc.nextInt();
        
        int orginal = number;
        int reverse = 0;

        while(number > 0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        if(reverse == orginal){
            System.out.println("its a palindrome ");
        }
        else{
            System.out.println("its a not palindrome");
        }
        sc.close();
    }
}