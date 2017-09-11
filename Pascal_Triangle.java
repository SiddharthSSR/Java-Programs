
import java.io.*;//importing from java
public class PascalTriangle {//the class starts
    public static void main(String[] args)throws IOException {//the method starts
        try {//the loop starts
            BufferedReader br = new BufferedReader(new InputStreamReader(
                        System.in));
            System.out.print("Enter rows for pascal triangle:");//waiting for user input

            int n = Integer.parseInt(br.readLine());//stores the value of rows

            for (int i = 0; i < n; i++) {//the for loop starts
                int number = 1;
                for (int j = 0; j < n - i; j++) {//the for loop starts
                    System.out.print("   ");
                }//the loop ends
                for (int k = 0; k <= i; k++) {//the for loop ends
                    System.out.print("   ");
                    System.out.print(number);
                    System.out.print("  ");
                    number = number * (i - k) / (k + 1);
                }//the loop ends
                System.out.println();

            }//the loop ends

        } catch (Exception e) {
            System.out.println(e);
        }//the loop ends
    }//the method ends
}//the class ends
/**
 *Sl. No.	Variable Name	Data Type	  Purpose
 *1	            n	          int       Store the number
 *2	            i	          int       Use as counter to the loop
 *3	            j		      int       Use as counter to the loop
 *4	            k	          int	    Use as counter to the loop
 */
