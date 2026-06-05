public class RightTrianglePattern{
    public static void RightTriangle(int n){
        // outer loop
        for(int i=1 ; i<=n; i++){
            //  inner loop
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
       RightTriangle(5);
    }
}
// output
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 