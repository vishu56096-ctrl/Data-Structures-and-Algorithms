import java.util.*;

public class GradeCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("enter your marks : ");
        int marks = sc.nextInt();

        if(marks > 90){
            System.out.println("your grade is A+");
        }
        else if(75 <= marks && marks <= 89  ){
            System.out.println("your grade is B");
        }
        else if(50 <= marks && marks <= 74){
            System.out.println("your grade is C");
        }else{
            System.out.println("you are fail");
        }
    }
}