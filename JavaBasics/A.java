public class A {
    static int b =20;//static variable
    int c  =30;//instance variable
    public static void main(String[]args){
        int a =10;//local variable
        System.out.println(a);
        System.out.println(A.b);
        A ref = new A();
        System.out.println(ref.c);
        
        

    }
    
}
