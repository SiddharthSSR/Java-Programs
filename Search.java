//It reverses the word as soon as an alphabet is found

//Importing io package
import java.io.*;
public class PigLatin
{//Class starts
    public static void main(String args[])throws IOException{//Method starts
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Taking the name of any place or city
        System.out.println("Enter the name of any city");
        String name = br.readLine();
        
        //Storing the length of the word
        int len = name.length();
        int i = 0;
        String n1;
        char letter;
        for(i = 0; i < len; i++){
            letter = name.charAt(i);
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                n1 = name.substring(i, len);
                System.out.println(n1 + name.charAt(0) + "ay"); 
                break;
            }
        }     
        System.out.println("****************************");
    }
}
/* Variable           Type              Description
 *  name              String            to store the sentence
 *  len               int               to store the length of sentence
 *  n1                String            to store each character of sentence
 *  i                 int               counter variable
 */
