//Sorting the numbers using BUBBLE SORT

//Importing io package
import java.io.*;
public class Bubble_Sort
{//Class starts
    //Method to do the bubble sort
    public void doBubbleSort(int [] arr, int n){//Method starts
        int i, temp, j;
        for(i = n+1; i > 0; i--){
            for(j = (n+1)-i-1; j > 0; j--){
                if(arr[j] > arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
    
                }
            }
       }
       for(int z = 0; z < n; z++){
           System.out.print(arr[z] + " ");
       }
    }//Method ends
    
    public static void main(String args[])throws IOException{//Main Method starts
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter array size");
       int n = Integer.parseInt(br.readLine());
       Bubble_Sort obj1 = new Bubble_Sort();
       int [] arr = new int [n];
       for(int i = 0; i < n; i++){
         System.out.println("Enter element at index: " + i);
         arr[i] = Integer.parseInt(br.readLine());
        }
        obj1.doBubbleSort(arr, n);
        System.out.println(" ");
        System.out.println("***********************");
    }//Main Method ends
}//Class starts

/* Variable      Type          Description
 *  i            int           counter variable
 *  j            int           to store the length of sentence
 *  temp         int           temporary variable
 *  z            int           counter variable
 *  n            int           to store the number
 *  arr          int           array to store numbers 
 *  i            int           counter variable
 *  srh          String        to store the value of search item
 *  j            int           counter variable
 */
