public class ButterflyPattern{
    public static void Butterfly(int n) {
        for(int i=1; i<=n; i++){

             for(int j=1; j<=i; j++){
                System.out.print("* ");
             }
             for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
             }
             for(int j=1; j<=i; j++){
                System.out.print("* ");
             }
             System.out.println();
        }
        //  buttom part
        for(int i=n-1; i>=1; i--){

            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  " );
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Butterfly(5);
    }
}

// output  important n-1 is very import for a second part
// *                 * 
// * *             * * 
// * * *         * * * 
// * * * *     * * * * 
// * * * * * * * * * * 
// * * * *     * * * * 
// * * *         * * * 
// * *             * * 
// *                 * 