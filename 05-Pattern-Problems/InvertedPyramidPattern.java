public  class InvertedPyramidPattern{
    public static void InvertedPyramid(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        InvertedPyramid(5);
        
    }
}
// output
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *