public class BinomialCCoficient {
    public static int factorial1(int n){

        int f =1;

        for(int i=1; i<=n; i++){
            
            f = f * i;
        }
        return f;
    }
    public static int binCoff(int n, int r){
       int fact_n=factorial1(n);
       int fact_r=factorial1(r);
       int fact_nmr=factorial1(n-r);


       int binCoff=fact_n/(fact_r*fact_nmr);
       return binCoff;
       

    }
    public static void main(String []args){
        System.out.println(binCoff(5,5));

    }
    
}
