
// public class InvertedStarPattern {
//     public static void main(String []args){
//         int n=7;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
    
// }

public class NumberPattern {
    public static void main(String[] args) {
        int num = 15; 
        int rows = 5; 

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j <= rows - i; j++) {
                System.out.print(num-- + " ");
            }
            System.out.println();
        }
    }
}