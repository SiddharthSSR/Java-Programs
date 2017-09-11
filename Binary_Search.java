import java.io.*;//importing from java
public class BinarySearch
{//the class starts
    public static void main(String args[])throws IOException{//the methods starts
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");//waiting for user's input
        int n = Integer.parseInt(br.readLine());//stores the size of array
        int[]arr = new int[n];
        System.out.println("Enter " + n + " array elements");
        for(int j = 0; j < n; j++){//the for loop starts
            System.out.println("Enter the array element at index "+ j +" :");
            arr[j] = Integer.parseInt(br.readLine());
        }//the for loop ends
        System.out.println("Enter the element to be searched:");//waiting for user's input
        int searchItem = Integer.parseInt(br.readLine());//stores the value of searchItem
        int flag = 0;//initialising variable
        int min , max ;//initialising variable
        int mid = 0;//initialising variable
        min = 0;//initialising variable
        max = arr.length - 1; //initialising variable   
        while(min <= max){//the while loop starts
            mid = (min + max)/2;
            if(searchItem > arr[mid]){//the if_else loop starts
                min = mid + 1;
            }
            else if(searchItem < arr[mid]){
                max = mid - 1;
            }
            else {
                flag = 1;
                break;
            }//the loop ends
        }//the while loop ends
        if(flag == 1){//the if_else loop starts
            System.out.println("Element present at position : " + (mid + 1));
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
 *4	          min	          int	    Stores the minimum limit of array
 *5	          max             int       Stores the maximum limit of array
 *6	          mid             int       Stores the mid value of array
 */
