public class FuctionArgument {
    public static void update(int marks[]){
        for (int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }

    }
    public static void main(String[] args) {
        int marks[] = {96,97,98,99};
        update(marks);

        //print our marks
        for (int i=0; i<marks.length; i++){
            System.out.print(marks[i] +" ");
        }
        System.out.println();
     }
}
    

