                                         //Syntax with parameter
import java.util.*;
public class sumMethode {
    public static int calculateSum(int num1, int num2){ //parameter or formal parameter
      
         int sum= num1 + num2;
         return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter a any number:");
        Scanner sc=new Scanner(System.in);    
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum= calculateSum(a,b); // argumment actual parameter
        System.out.print("sum is="+sum);
    }
}
    
