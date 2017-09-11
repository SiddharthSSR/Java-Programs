
import java.io.*;
public class String_Palindrome
{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ans = "yes";
        while(ans != "no"){
            System.out.println("Enter any name");
            String name = br.readLine();
            int len = name.length();
            String backwards = "";
            char t = ' ';
            String n = name;        
            for(int i = len-1; i >= 0; i--){
                t = n.charAt(i);
                backwards = backwards + t;
            }
            System.out.println(backwards);
            if(name.compareTo(backwards) == 0){
                System.out.println("Palindrome");
            } else {
                System.out.println("not Palindrome");
            }
            System.out.println("Do you want to continue: ");
            ans = br.readLine();
            if(ans == "no"){
                System.out.println("Thank you");
                break;
            }
        }
    }
}
