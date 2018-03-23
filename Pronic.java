//20 = 4 * 5
//12 = 3 * 4
//Product of Consecutive numbers is a Pronic Number 
import java.util.*;
class Pronic {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int num = n;
		for(int i = 0; i < num/2 - 1; i++){
			if((i*(i+1)) == n){
				System.out.println("Found " + i + " " + (i+1));
			}
		}
	}
}