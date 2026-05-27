import java.util.*;

public class WeekdaySwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("enter your number : ");
        int number = sc.nextInt();

        switch(number){
            case 1: System.out.println("today is monday ! ");
            break;
            case 2 : System.out.println("today is tuesday ! ");
            break;
            case 3: System.out.println("today is wednesday !");
            break;
            case 4 :  System.out.println("today is thursday !");
            break;
            case 5 : System.out.println("today is friday ! ");
            break;
            case 6 : System.out.println("today is saturday ! ");
            break;
            case 7 :  System.out.println("today is sunday !");
            break;
            default:  System.out.println("Invalid input ! enter days range between 1 to 7");
                
        }
    }
}
