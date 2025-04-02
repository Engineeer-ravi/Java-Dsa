public class MenuHwSearch {
    public static int menuSearch(String menu[],String Search){
        for(int i=0; i<menu.length; i++){
            if(menu[i].equals(Search)){
                return i;
            }
        }
         return -1;

    }

    public static void main(String[] args) {
        String menu[]={"Samosa", "dosa","Chap","Pakoda","Sandwitch","tost"};
        String Search="lassi";
        int index = menuSearch(menu,Search);
        if(index== -1){
            System.out.print("Not Found");
        }
        else{
            System.out.print("Item At Index:"+index);
        }
        
    }
}
    

