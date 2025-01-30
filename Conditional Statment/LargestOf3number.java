

public class LargestOf3number {
    public static void main(String []args){
        int a=3, b=5, c=4;
        if((a>=b) && (a>=c)){
            System.out.println("a is greater");
        }
        else if((b>=a) && (b>=c)){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }
    }
    
}
