import java.util.*;

public class SimpleCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter number : ");
        int a = sc.nextInt();
        
        System.out.println("enter number : ");
        int b = sc.nextInt();

        System.out.println("enter operator : ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+': System.out.println("Addition : " + (a+b));
            break;
            case '-' : System.out.println("Subtraction : " + (a-b));
            break;
            case '*' : System.out.println("Multiplication : " + (a*b));
            break;
            case '/' : System.out.println("Division : " + (a/b));
            break;
            default: System.out.println("thx u");
        }
    }
}
