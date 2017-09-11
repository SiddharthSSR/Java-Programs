
import java.io.*;
public class String_Sort
{
    public static void main(String[] args)throws IOException
    {
        int i, j;
        String temp;
        int tem;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of persons");
        int n = Integer.parseInt(br.readLine());
        
        String names[] = new String[n];
        int nos[] = new int[n];

        System.out.print("Enter"+ n + " Names and Number : ");
        for(i = 0; i < 5; i++){
            names[i] = br.readLine();
            nos[i] = Integer.parseInt(br.readLine());
        }

        for(i = 0; i < n; i++){
            for(j = 1; j < n; j++){
                if(names[j-1].compareTo(names[j]) > 0)
                {
                    //Names
                    temp       = names[j-1];
                    names[j-1] = names[j];
                    names[j]   = temp;
                    //Numbers
                    tem        = nos[j-1];
                    nos[j-1]   = nos[j];
                    nos[j]     = tem;
                }
            }
        }

        System.out.println("\nNow the List is :\n");
        for(i = 0; i < 5; i++)
        {
            System.out.println(names[i]);
            System.out.println(nos[i]);
        }
    }
}
