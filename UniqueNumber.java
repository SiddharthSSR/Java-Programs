
import java.util.*;
public class UniqueNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int nbr = sc.nextInt();
        int n = nbr;
        String num = Integer.toString(nbr);
        int size = num.length();
        System.out.println("size of number " + size);
        int digit = 0;
        int [] arr = new int[size];
        for(int i = size-1; i >= 0; i--){
            digit = nbr % 10;
            arr[i] = digit;
            nbr = nbr / 10;
        }
        for(int a = 0; a < size; a++){
            System.out.println(arr[a]);
        }
        Outer : for(int i = 0; i < size; i++){
            Inner :for(int j = 1; j < size; j++){
                if(arr[j] == arr[i]){
                    System.out.println("Found at " + j + " " + i);
                    break Outer;
                }
            }
        }
    }
}

