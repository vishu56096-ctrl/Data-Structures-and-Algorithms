public class DiamondPattern{
    public static void DiamondPattern(int n){
        //  top  part
        for(int i=1; i<= n+1; i++){ 
            // SPACES
            for(int j=1; j<=n+1-i; j++){
                System.out.print(" ");
            }
            // STARS
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        // buttom part
        for(int i=n; i>=1; i--){
            //   print space
            for(int j=1; j<=n+1-i; j++){
                   System.out.print(" ");
            }
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();

 }
    }
    public static void main(String[] args){
         DiamondPattern(4);
    }
}
// here in middle  on single is hight star then upper part take n+1 and second part take only n and also all thing second part work on (i)
// output
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 