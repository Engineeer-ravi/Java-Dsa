public class inverted15to1{
    public static void main(String []args){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i+1; j++){
                System.out.print(5*i-j+1 + " ");
            }
            System.out.println();
        }
    }


    
}
