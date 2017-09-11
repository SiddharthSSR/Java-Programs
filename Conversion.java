//Converting binary numbers to decimal numbers and decimal to binary numbers

//Importing io package
import java.io.*;
public class Binary_To_Decimal
{//Class starts
    public void doBinToDeci(int nbr){//Method starts
        int digit = 0, newa = 0, sum = 0, i = 0;
        while(nbr != 0){
            digit = nbr % 10;
            newa = digit * (int)Math.pow(2, i);
            sum = sum + newa;
            nbr = nbr / 10;
            i++;
        }
        System.out.println("The Binary Number is : " + sum);
    }//Method ends

    public void doDeciToBin(int nbr){//Method starts
        int digit = nbr, newa = 0, sum = 0, rem = 0, rev = 0, num = 0;
        while(digit != 0){
            newa = nbr % 2;
            rem = newa;
            sum = (sum*10) + rem;
            digit = nbr / 2;
            nbr = digit;
        }
        while(sum != 0){
            num = sum % 10;
            rev = (rev * 10) + num;
            sum = sum / 10;
        }
        System.out.println("The Decimal Number is : " + rev);
    }//Method ends

    public void terminate(int t)throws IOException{//Method starts
        Binary_To_Decimal obj1 = new Binary_To_Decimal();
        if(t == 0){
            System.out.println("Thank You!!");
        } else {
            obj1.display();
        }
    }//Method ends

    public void display()throws IOException{//Method starts
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Binary_To_Decimal obj1 = new Binary_To_Decimal();
        System.out.println("Enter A Number");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter 1 for Binary to Decimal and 2 for Decimal to Binary");
        int s = Integer.parseInt(br.readLine());
        if(s == 1){
            obj1.doBinToDeci(n);
        } else {
            obj1.doDeciToBin(n);
        }
        System.out.println("Enter 0 for terminating and 1 for Continuing the program");
        int t = Integer.parseInt(br.readLine());
        obj1.terminate(t);
    }//Method ends

    public static void main(String args[])throws IOException{//Main Method starts
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Binary_To_Decimal obj1 = new Binary_To_Decimal();
        obj1.display();
    }//Main method ends
}//Class ends

/* Variable         Type           Description
 *  digit           int            to store the digits of the sentence
 *  newa            int            to store the digit times 2
 *  sum             int            to store sum of newa
 *  i               int            counter variable
 *  rem             int            to store the remainder of the number
 *  rev             int            to store the reverse of the sentence
 *  n               int            to store the number 
 *  s               int            to store the choice
 */
