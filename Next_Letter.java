import java.util.*;
class Next_Letter {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word");
		String word = sc.next();
		char c = ' ';
		int len = word.length();
		String new_word = "";
		for(int i = 0; i < len; i++){
			c = word.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
				c = (char)(c+1);				
			}
			new_word += c;
		}
		System.out.println(new_word);
	}
}