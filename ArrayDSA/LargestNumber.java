
public class LargestNumber {
    public static int largestNum(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        System.out.println("The Smallest Number Is:"+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,4,6,8,9,11};
 
        System.out.print("The Largest number is:"+largestNum(numbers));
        
    }
}
    

