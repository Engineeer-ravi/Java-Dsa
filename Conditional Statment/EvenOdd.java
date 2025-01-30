
import java.util.Scanner;
public class EvenOdd {
    public static void main(String  []args){
        System.out.println("Enter the number");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    
}
