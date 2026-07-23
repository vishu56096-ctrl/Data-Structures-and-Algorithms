public class FloydTrianglePattern{
    public static void FloydTriangle(int n) {
        int ch = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        FloydTriangle(4);
    }
}
// output
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 