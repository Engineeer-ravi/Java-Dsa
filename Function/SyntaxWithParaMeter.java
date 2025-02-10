import java.util.*;
// syntax
// returnType name(type param1,type param2){
// body
// return statment;
// }
public class SyntaxWithParaMeter {
    public static int calculateSum(int a, int b){  //parameters or formal parameters
       
        int sum = a+b;
     // function Difinition
        return sum;



    }
    public static void main(String []args){
        System.out.print("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //finction  call
        System.out.print("Enter b Number:");
        int b = sc.nextInt();
        int sum=calculateSum(a,b); //argument or actual parameter
        System.out.println("sum is :"+sum);
    }
    
}
