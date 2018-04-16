import java.util.*;
class Encryption {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sent = sc.nextLine();
		System.out.println("Enter shift value");
		int shift = sc.nextInt();
		int len = sent.length();
		char c = ' ';
		String word = "";
		for(int i = 0; i < len; i++){
			c = sent.charAt(i);
			if(c == ' '){
				word += c;
			} else {
				if(c == 'z'){
					c = 'a';
					word += (char)(c+(shift-1));
					shift++;
				}
				word += (char)(c + shift);
			}
		}
		System.out.println(word);
	}
}