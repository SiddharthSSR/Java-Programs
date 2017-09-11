
import java.io.*;//impoting from java
public class Automorphic_Number
{//starting the class
    public static void main(String args[])throws IOException{//starting the mehod
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any Natural Number");//waiting for user's input
        int nbr = Integer.parseInt(br.readLine());//the variable stores the value of number
        int s , ld1 = 0 , ld2 = 0 ;//initialising the variables
        if(nbr < 10){//the if_else loop starts
            s = nbr * nbr;
            ld1 = s % 10;
            if (nbr == ld1){//the second loop starts
                System.out.println("this is a Automorphic Number");
            }
            else{
                    System.out.println("This is not a Automorphic Number");
        }//the loop ends
        }//the loop ends
         else if ((nbr >= 10)&&(nbr < 100)){
         s = nbr * nbr;
         ld2 = s % 100;
         if (nbr == ld2){//the loop starts
         System.out.println("this is a Automorphic Number");
        }
        else{
             System.out.println("This is not a Automorphic Number");
            }//the loop ends
        }//the elseif ladder loop ends
    }//the method ends
}//the class ends
/**
*Sl. No.	Variable Name	Data Type	Purpose
*1	            nbr	          int	    Store the number
*2	             s	          int	    To find the square of number
*3	            ld1	          int       to find the value of 1st last digit 
*4	            ld2	          int       To find the value of 2nd last digit
*/
    
