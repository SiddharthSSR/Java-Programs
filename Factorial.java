
import java.io.*;//importing from java

public class Factorial {//the class starts
    public static void main(String args[])throws IOException {//the method starts
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number:");//waiting for user's input 
        int number = Integer.parseInt(br.readLine());//the variable stores the value of number
        int result = factorial(number);
        System.out.println("Factorial of entered number is: " + result);
    }//the method ends 
    static int factorial(int x) {//the main method starts
        int result;
        if (x == 1) {//the if loop starts
            return 1;
        }//the loop ends
        // Call the same method with argument x-1
        result = factorial(x - 1) * x;
        return result;
    }//themain method ends
}//the class ends
/**
 *Sl. No.	Variable Name	Data Type	Purpose
 *1	            number	      int	    Store the value of number
 *2	            result	      int	    Finds the factorial of number
 *3	              x	          int       finding the result
 */
