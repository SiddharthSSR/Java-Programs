//The number is a BUZZ NUMBER if it ends with 7 or is divisible by 7

//Importing io package
import java.io.*;
public class Buzz_Number
{//Class starts
    public void buzzNumber(int a){ //Method starts
        int digit = 0, lastD = 0;
        digit = a % 10;
        lastD = lastD + digit;
        if(lastD == 7){
            System.out.println("The number is a BUZZ NUMBER");
        } else{
            System.out.println("The number is not a BUZZ NUMBER");
        }
    }//Method ends

    public void Divisible(int a){ //Method starts
        if((a % 7) == 0){
            System.out.println("It is divisible by 7");
        } else {
            System.out.println("It is not divisible by 7");
        }
    }

    public static void main(String args[])throws IOException{//Main method starts
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Taking a number from user
        System.out.println("Enter a number");
        int n = Integer.parseInt(br.readLine());
        
        Buzz_Number obj1 = new Buzz_Number();
        
        System.out.println("Enter 1 for Divisible by 7 or 2 for Buzz Number");
        int choice = Integer.parseInt(br.readLine());
        if(choice == 1){
            obj1.Divisible(n);
        } else {
            obj1.buzzNumber(n);
        }
        System.out.println("************************");
    } //Method ends
}//Class ends

/* Variable           Type            Description
 *  n                 int             to store the value of number
 *  choice            int             to store choice of user
 *  digit             int             to store the value of number after division
 *  lastD             int             checking if the last digit is 7
 *  i                 int             counter variable
 */
