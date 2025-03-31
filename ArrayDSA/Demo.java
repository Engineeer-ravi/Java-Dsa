import java.util.Scanner;
public class Demo {
    public static void main(String []args){
        // //  Example for Dynamic  Array
        // int a[]={1,2,3,4,5};
        // System.out.println(a[3]);
      

        // // Example for Static Array
        // int a[]= new int[5];
        // a[0]=1;
        // a[1]=2;
        // a[2]=2;
        // a[3]=3;
        // a[4]=4;
        // for(int i=0; i<5; i++){
        //     System.out.println(a[i]);
        // }

        //ennter the size of array
        int size , i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        size =sc.nextInt();
        int a[]= new int[size];
        for( i=0; i<size; i++){

            a[i]=sc.nextInt();
        }
        // print the arra
        System.out.println("print th element of array:");
        for(i=0; i<size; i++){
            System.out.print(a[i]+" ");
        }


    }
    
}
