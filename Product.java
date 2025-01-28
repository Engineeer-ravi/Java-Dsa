import java.util.Scanner;
public class Product {
    public static void  main(String[]aStrings){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter The Number =");
        int a = scn.nextInt();
        System.out.print("Enter The Number =");
        int b = scn.nextInt();
        int product=a*b;
        System.out.print("Product:");
        System.out.print(product);

    }
    
}
