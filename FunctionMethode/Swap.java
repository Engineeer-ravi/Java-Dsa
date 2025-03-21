public class Swap {

    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);


    }
    public  static void main(String[]args){
        //swap value exchenge
        int a=5;
        int b=30;
        swap(a,b);


    }
//without  useing  function swap
    // public static void main(String[] args) {
    //     //swap - value exchenge
    //     int a=5;
    //     int b=10;
    //     //swap
    //     int temp =a;
    //     a= b;
    //     b= temp;

    //     System.out.println("a="+a);
    //     System.out.println("b="+b);


    }

    

