
import java.io.*;
public class Sentence_Piglatin
{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence");
        String sen = br.readLine();
        int len = sen.length();
        String [] arr = new String[len];
        char c = ' ';
        int y = 0;
        for(int i = 0; i < len; i++){
            arr[i] = " ";
        }
        for(int i = 0; i < len; i++){
            c = sen.charAt(i);
            if(Character.isWhitespace(c) == true){
                y++;
            }
            arr[y] = arr[y] + c;    
        }
        String [] arr2 = new String[y+1];
        char s = ' ';
        for(int a = 0; a < y+1; a++){
            arr2[a] = "";
        }
        for(int x = 0; x < y+1; x++){
            for(int i = arr[x].length()-1; i >= 0; i--){
                s = arr[x].charAt(i);
                arr2[x] = arr2[x] + s; 
            }
        }
        for(int i = 0; i < y+1; i++){
            System.out.print(arr2[i]);
        }
    }
}
