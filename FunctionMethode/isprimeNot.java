
import java.net.PortUnreachableException;

public class isprimeNot {

    // public static boolean isPrime(int n){
    //     boolean isPrime = true;
    //     for(int i=2; i<=n-1; i++){
    //         if(n%i==0){//complitly divisible by i
    //             isPrime=false;
    //             break;
    //         }
    
    //     }
    //     return isPrime;
    // }
    // public static void main(String[] args) {
    //     System.out.print(isPrime(4));
    // }

    //Optimised chcke is prime or not
    public static boolean isprime(int n){
        if(n==2){
            return true;
         }
         for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
            return true;
        }
        
    public static void main(String[] args) {
        System.out.print(isprime(4));
    
}
}
