public class LinearSearch {
    // Linear search algorithm
    public static int intlinearSearch(int number[],int key){
        for(int i=0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int number[]={1,2,3,4,6,10,26,30};
        int key=40;
        int index=intlinearSearch(number,key);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.print("found at index:"+index);
        }

    }
    
}
