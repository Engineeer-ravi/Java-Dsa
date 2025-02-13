public class HollowRectangle {

    public static void hollow_reactangle(int totRows, int totCols){
        for(int i=1; i<=totRows; i++){
            //inner - columns
            for(int j=1; j<=totCols; j++){
                //cell -(i,j)
                if(i == 1 || i == totRows ||  j == 1 || j  == totCols){
                    //boundry-colns
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }     
            }
            System.out.println();

        }
    }
    public static void main(String[]args){
        hollow_reactangle(5,8);
    }
    
}
