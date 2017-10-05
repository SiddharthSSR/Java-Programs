import java.util.*;  
class Dictionary{  
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist  
        System.out.println("Enter a word");
        String word = sc.next();
        int len = word.length();
        char c = ' ';
        for(int i = 0; i < len; i++){
            c = word.charAt(i);
            list.add(""+c);
        }
        System.out.println("Enter search word");
        String search = sc.next();
        char s = search.charAt(0);
        for(String obj : list){
            if(obj.compareTo(search) == 0){
                System.out.println("Answer");
            }
        }
    }  
}  
