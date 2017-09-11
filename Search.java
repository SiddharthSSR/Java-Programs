
import java.io.*;
public class Search
{ // class starts
    public static void main(String args[])throws IOException{// method starts
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Asking for the sentence 
        System.out.println("Enter a sentence");
        String sen = br.readLine();
        
        //Initialising the variables
        int len = sen.length();
        String [] arr = new String[len];
        char c = ' ';
        int y = 0;
        int flag = 0;
        int x = 0;
        	
        //Initialising the array 
        for(int i = 0; i < len; i++){
            arr[i] = "";
        }
        
        //Storing each word into arrray
        for(int i = 0; i < len; i++){
            c = sen.charAt(i);
            if(Character.isWhitespace(c) == true){
                y++;
            }
            arr[y] = arr[y] + c;    
        }
        
        // Asking the word to search in sentence
        System.out.println("Enter the word you want to search");
        String srh = br.readLine();
        
        // Search Algorithm
        for(int j = 0; j < y+1; j++){
            if(srh.compareTo(arr[j].trim()) == 0){
                flag = 1;
                x = j;
            }
        }
  
        if(flag == 1){
            System.out.println("The word is at position: " + (x+1));
            System.out.println("Thank You!");
        } else {
            System.out.println("Sorry , there is such word in the sentence");
        }
    }// Method ends
}// Class ends

/* Variable         Type                Description
 *  sen             String              to store the sentence
 *  len             int                 to store the length of sentence
 *  c               char                to store each character of sentence
 *  y               int                 counter variable
 *  flag            int                 counter variable
 *  x               int                 to store value of j
 *  i               int                 counter variable
 *  srh             String              to store the value of search item
 *  j               int                 counter variable
 */



