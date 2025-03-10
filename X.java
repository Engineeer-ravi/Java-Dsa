 public class X {
    int a ;
    String name;
    X()
    {
        a=10;
        name="Ravi Pathak";
    }
    void show()
    {
          System.out.println(a+" "+name);
    }
    
}
class  b
    {
    public static void main(String[]args){
        X obj = new X();
        obj.show();

    }   
}
