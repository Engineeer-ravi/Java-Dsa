public class HalfPyramind {
    public static void half_pyramind(int n){
        //outer
        for(int i=1; i<=n; i++){
            //spaces print
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star print
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();


        }

    }
    public static void main(String[] args) {
        half_pyramind(5);
        
    }
}
    
