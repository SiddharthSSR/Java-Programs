//Converting the capital letters to small letters and small letters to capital letters

//Importing io package
import java.io.*;
public class Capital_Small
{//class starts
    public static void main(String args[])throws IOException{//method starts
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        //Asking for the sentence
        System.out.println("Enter any name");
        String name = br.readLine();
        
        //Taking the length of the sentence
        int len = name.length();
        for(int i = 0; i < len; i++){
            char letter = name.charAt(i);
            if( 64 < letter && letter < 95){
                letter = (char)(letter + 32);
            }
            else if(96 < letter && letter < 123){
                letter = (char)(letter - 32);
            }
            System.out.print(letter);
        }
        System.out.println("  ");
        System.out.println("*******************************");
    }//Method ends
}//Class ends

/* Variable           Type                Description
 *  name              String              to store the sentence
 *  len               int                 to store the length of sentence
 *  letter            char                to store each character of sentence
 *  i                 int                 counter variable
 */
