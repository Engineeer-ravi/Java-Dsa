public class halfpyramind1to15 {
    public static void main(String []args){
        int n = 1;
        for(int i = 1; i <= 15; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
