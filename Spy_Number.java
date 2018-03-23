//1124 is a Spy Number
//1 + 1 + 2 + 4 = 1 * 1 * 2 * 4
//Product = Sum 
import java.util.*;
class Spy_Number {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long n = sc.nextLong();
		int sum = 0, product = 1;
		long num = n, digit = 0;
		while(num != 0){
			digit = num % 10;
			sum += digit;
			product *= digit;
			num = num / 10;
		}
		if(product == sum){
			System.out.println("It is a Spy Number");
		} else {
			System.out.println("It is not a Spy Number");
		}
	}
}