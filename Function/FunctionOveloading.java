class FunctionOveloading {

    // // Corrected method for performing calculations
    // public static void multiply(int a, int b) {
    //     System.out.println(a * b);
    // }

    // public static void multiply(double a, double b) {
    //     System.out.println(a * b);
    // }

    // public static void multiply(int a, int b, int c) {
    //     System.out.println(a * b * c);
    // }

    // public static void multiply(float a, float b) {
    //     System.out.println(a * b);
    // }

    // public static void main(String[] args) {
    //     // Example usage of overloaded methods
    //     multiply(2, 3);           // Calls multiply(int, int)
    //     multiply(2.5, 3.5);       // Calls multiply(double, double)
    //     multiply(2, 3, 4);        // Calls multiply(int, int, int)
    //     multiply(2.5f, 3.5f);     // Calls multiply(float, float)
    // }

    // // Overloaded methods for calculating sum

    // public static int sum(int a, int b) {
    //     return a + b;
    // }
    // public static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }

    // public static void main(String[]args){
    //     System.out.println(sum(2, 3));           // Calls sum(int, int)
    //     System.out.println(sum(2, 3, 4));        

    // }

    // // Overloaded methods for using data types

    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Sum of 2 and 3 is: " + sum(2, 3));
        System.out.println("Sum of 2.5 and 3.5 is: " + sum(2.5f, 3.5f));           
    }
}
