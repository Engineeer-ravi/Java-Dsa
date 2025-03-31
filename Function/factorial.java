
import java.util.Scanner;


class factorial{

    public static int factorial1(int n){

        int f =1;

        for(int i=1; i<=n; i++){
            
            f = f * i;
        }
        return f;
    }
    public static void main(String[]args){
    System.out.println("Enter the number:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print("Factorial:"+factorial1(n));

    }
}