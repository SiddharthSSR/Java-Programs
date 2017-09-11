

import java.io.*;
public class Squares_Cubes
{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());
        int[]arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter element at : " + i);
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[]arr2 = new int[n];
        for(int j = 0; j < n; j++){
            if((arr[j] % 2) == 0){
            arr2[j] = (int)Math.pow(arr[j], 2);
        } else {
            arr2[j] = (int)Math.pow(arr[j], 3); 
        }
        }
        System.out.println("Enter the number to be searched");
        int nbr = Integer.parseInt(br.readLine());
        int flag = 0;
        for(int a = 0; a < n; a++){
            if(arr2[a] == nbr){
             System.out.println("Element at index " + a);
            }
        }
    }
}
