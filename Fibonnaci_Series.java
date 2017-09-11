
import java.io.*;//importing from java

public class FibonacciSeries {//the class starts
    public static void main(String[] args) throws NumberFormatException,IOException {//the method starts 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length of fibonacci numbers : ");//waiting for user's input
        int totalCount = Integer.parseInt(br.readLine());//stores the value of length
        int a;//assingning variables
        int b = 0;//initialising variables
        int c = 1;//initialising variables
        System.out.print("Fibonacci Series : " + b);
        for (int i = 1; i < totalCount; i++) {//the for loop starts
            System.out.print(" " + c + " ");
            a = b;
            b = c;
            c = a + b;
        }//the for loop ends
    }//the method ends 
}//the class ends
/**
 *Sl. No.	Variable Name	Data Type	Purpose
 *1	            a             int	    Store the value of number
 *2	            b	          int	    Store the value of number
 *3	            c		      int       Store the value of number
 *4	            i             int	    counter variable
 */
