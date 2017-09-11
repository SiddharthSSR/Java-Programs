

import java.io.*;//importing from java
public class Neon_Numbers
{//the class starts
    // main method begins execution of this class
    public static void main(String args[])throws IOException {//the method starts
        int square, total = 0;//initialising the variable
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        // Waiting for the user input
        int n = Integer.parseInt(br.readLine());//the variabe is storing the value of number
        square = n * n;//taking the square of the number
        while (square != 0) {//the while loop starts
            total += (square % 10);
            square = square / 10;
        }//the while loop ends
 
        if (total == n) {//the if_else loop starts
            System.out.println("The number is a neon number ");
        } else {
            System.out.println("The number is not a neon number");
        }//the if_else loop ends
 
    } // end method main
} // end class
/**
*SN	 Variables	Type	Description
*1.   n 	     int	 This will hold the value generated through user
*2.	square	     int	 This will hold the square value of the number generated through user.
*3.	total	     int	 This will sum of the square digits of the value of the number generated through user.
*4.	main()function	     This function is the entry point of the programm*/







