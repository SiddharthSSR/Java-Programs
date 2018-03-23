import java.util.*;
class First_Letter {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = sc.next();
		String new_sent = "";
		char c = ' ';
		int len = sentence.length();
		for(int i = 0; i < len; i++){
			c = sentence.charAt(i);
			if(c == ' '){
				c = sentence.charAt(i+1);
				c = (char)(c - 64);
				new_sent = new_sent + c;
			}
		}
		System.out.println(new_sent);
	}
}