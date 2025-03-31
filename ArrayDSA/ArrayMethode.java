                             // Java program to demonstrate the use of toString()  asList() and deeptoString()
import java.util.Arrays;


public class ArrayMethode {
    public static void main(String[] args) {
        String a[]={"Ravi","Pathak","I Love Java"};
        System.out.println("toString() method: "+Arrays.toString(a));
        System.out.println("asList() method: "+Arrays.asList(a));

        int b[][]={{1,2,3},{4,5,6}};
        System.out.println("toString() method: "+Arrays.deepToString(b));
        
    }
    
}
