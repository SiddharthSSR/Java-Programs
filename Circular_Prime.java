import java.util.*;
class Circular_Prime {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int digit = 0, nbr = n, num = n;
		int flag = 0;
		for(int i = 2; i < num/2; i++){
			if(num % i == 0){
				System.out.println("Not Prime");
				flag = 0;
				break;
			} else {
				flag = 1;
			}
		}
		if(flag == 1){
			while(nbr != 0){
				digit = nbr % 10;
				if(digit % 2 == 0){
					System.out.println("Not Circular Prime");
				} else {
					System.out.println("Circular Prime");
				}
				nbr = nbr / 10;
			}
		}else {
			System.out.println("Not Circular Prime");
		}
	}
}