import java.util.Scanner;
public class areaOfcircle {
    public static void main(String[]args){
        Scanner scn  = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        float rad = scn.nextFloat();
        float area= 3.14f * rad *rad;
        System.out.println("The area of the circle is: ");
        System.out.println(area);

    }    
    
}
