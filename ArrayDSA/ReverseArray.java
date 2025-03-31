                    //Print The Array in Reverse Order
                    //input a[]=[10,20,30,40,50]   ----->>> 50,40,30,20,10

import java.util.Scanner;
public class ReverseArray {
    public static void main(String []args){
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<5; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("The elements of the array are:");
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+"   ");
        }
        System.out.println("\nThe array in reverse order is:");
        for(int i=a.length-1; i>=0; i--){
            System.out.print(a[i]+"   ");
        }

    }
}
