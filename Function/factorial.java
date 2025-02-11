public class factorial {
    public static int factoorial(int n){
        int f=1;

        for(int i=1; i<=n; i++){
             f=f*i;   
        }
        return f;

    }
    public static void main(String[]args){
       System.err.println(factoorial(5));

    }

    
}
