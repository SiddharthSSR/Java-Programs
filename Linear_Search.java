
import java.io.*;//importing from java
public class LinearSearch
{//the class starts
    public static void main(String args[])throws IOException{//the method starts
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");//waiting for user input
        int n = Integer.parseInt(br.readLine());//stores the size of array
        int[]arr = new int[n];
        System.out.println("Enter " + n + " array elements");
        for(int j = 0; j < n; j++){//the for loop starts
            System.out.println("Enter the array element at index "+ j +" :");
            arr[j] = Integer.parseInt(br.readLine());
        }//the for loop ends
        System.out.println("Enter the element to be searched:");//waiting for user input
        int searchItem = Integer.parseInt(br.readLine());//stores the value of searchItem
        int flag = 0 , i ;//initialising variable
        for( i = 0; i < n ; i++){//the for loop starts
            if(searchItem == arr[i]){//the if loop starts
                flag = 1;
                break;
            }//the loop ends
        }//the loop ends
        if(flag == 1){//the if_else loop starts
            System.out.println("Element present at position : " + (i + 1));
        }
        else{
            System.out.println("Element is not found");
        }//the loop ends
    }//the method ends
}//the class ends
/**
 *Sl. No.	Variable Name	Data Type	  Purpose
 *1	            n	          int       Store the number
 *2	            j	          int       Use as counter to the loop
 *3	      SearchItem		  int       Stores the value of search item
 *4	            i	          int	    Use as counter to the loop
 */
