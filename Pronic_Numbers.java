//Product of two consecutive integers is known as a PRONIC NUMBER

//Importing io package
import java.io.*;
public class Pronic_Numbers
{//Class starts
    public static void main(String args[])throws IOException{//Method starts
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = 0;
        int n = 25;
        int [] arr = new int[n];
        for(int x = 0; x < n; x++){
            y = x + 1;
            arr[x] = x * y;
        }
        System.out.println("Enter any number ");
        int nbr = Integer.parseInt(br.readLine());
        int flag = 0; 
        for(int i = 0; i < n; i++){
            if(arr[i] == nbr){
                flag = 1;
            }
        }
        if(flag == 1){
            System.out.println("Found your number");
        } else {
            System.out.println("Sorry, not Found");
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
        System.out.println("*********************");
    }
}

/* Variable           Type        Description
 *  y                 int         to store number next to the first number
 *  n                 int         to store the length of array
 *  arr               int         to store each character of sentence
 *  x                 int         counter variable
 *  i                 int         counter variable
 *  flag              int         counter variable
 *  nbr               int         till which number 
 */
