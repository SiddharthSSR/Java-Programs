import java.io.*;
public class Special_Number
{
    public void doSpecial(int nbr){
        int digit = 0, sum = 0, newa = 0, i = 1;
        while(nbr != 0){
            digit = nbr % 10;
            while(i != (digit+1)){
                for(i = 1; i <= digit; i++){
                    newa =  digit * i;
                    sum = sum + newa;
                    nbr = nbr / 10;
                }
            }
        }

        if(sum == nbr){
            System.out.println("The Number is a Special Number");
        } else {
            System.out.println("The Number is not a Special Number");
        }
    }

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Special_Number obj1 = new Special_Number();
        System.out.println("Enter a number");
        int n = Integer.parseInt(br.readLine());
        obj1.doSpecial(n);
    }
}
