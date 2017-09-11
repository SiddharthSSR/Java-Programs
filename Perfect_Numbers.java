import java.io.*;
public class Perfect_Number
{
   public static void main(String args[])throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter A Number");
       int n = Integer.parseInt(br.readLine());
       int sum = 0, per;
       for (int i = 1; i < n; i++) {
       if (n % i == 0) {
        sum = sum + i;
       }
       }
       if(sum == n){
       System.out.println("It is a Perfect Number");    
       } else{
         System.out.println("It is not a Perfect Number");
       }
   }
}
