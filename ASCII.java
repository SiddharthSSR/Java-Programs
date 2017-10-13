
import java.io.*;
public class ASCII
{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence");
        String sen = br.readLine();
        int len = sen.length();
        String [] arr = new String[len];
        char c = ' ';
        int y = 0;
        int sum = 0;
        for(int i = 0; i < len; i++){
            arr[i] = "";
        }
        for(int i = 0; i < len; i++){
            c = sen.charAt(i);
            if(Character.isWhitespace(c) == true){
                y++;
            }
            arr[y] = arr[y] + c;    
        }
        //for(int i = 0; i < y+1; i++){
        //    System.out.println(arr[i].trim());
        //}
        int asc[] = new int[y+1];
        for(int i = 0; i < y+1; i++){
            arr[i] = arr[i].trim();
            for(int j = 0; j < arr[i].length(); j++){

                c = arr[i].charAt(j);
                sum += (int)c;
                asc[i] = sum;

            }
            sum = 0;
        }
        for(int i = 0; i < asc.length; i++){
            for(int j = 0; j < asc.length-i-1 ; j++){
                if(asc[j] > asc[j+1]){
                    int small = asc[j];
                    asc[j] = asc[j+1];
                    asc[j+1] = small;

                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
       for(int i = 0; i < asc.length; i++){
            System.out.println(arr[i]);
        }
    }
}
//for(int i = 0; i < asc.length; i++){
//    System.out.println(asc[i]);
//}
//for(int i = 0; i < asc.length; i++){
//    System.out.println(arr[i].trim());
//}
