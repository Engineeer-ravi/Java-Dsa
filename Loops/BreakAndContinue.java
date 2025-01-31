public class BreakAndContinue {
    public static void main(String []args){
        // for (int i = 1; i<=10; i++){
        //     if (i==5){
        //         break;
        //     }
        //     System.out.println(i);

        // }
        // System.out.print("I am out the loop");


        // keep entring number till user enters a multiple of  10
        // Scanner sc = new Scanner(System.in);
        // do{
        //     int n = sc.nextInt();
        //     if(n%10==0){
        //         break;
        //     }
        //     System.out.println(n);

        // }while(true);
        // System.out.print("Exit");


        //continue Statment
        for (int i = 1; i<=5; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }



    }
    
}
