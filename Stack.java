import java.util.*;

class Stack {
	int [] arr;
	int size, top;

	Stack (int n){
		size = n;
		arr = new int[n];
		top = -1;
	}

	void push(int element){
		if(top == (size-1)){
			System.out.println("overflow");
		}
		else {
			top += 1;
			arr[top] = element;
		}
	}

	void pop(){
		if(top == -1){
			System.out.println("underflow");
		}
		else {
			int val = arr[top];
			System.out.println("element to be removed is" + val);
			top = top - 1;
		}
	}

	void display(){
		for(int i = 0; i < arr.length-1; i++){
			System.out.println(arr[i]);
		}

	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int x = sc.nextInt();
		Stack s = new Stack(x);
        int c = 0;
       do{
        System.out.println("Enter 1 for push, 2 for pop, 3 for display and 4 for exit");
        int ch = sc.nextInt();
        switch(ch){
            case 1: System.out.println("Enter the element");
            int n = sc.nextInt();
            s.push(n);
            break;

            case 2: s.pop();
            break;

            case 3: s.display();
            break;
        }
        System.out.println("Press 1 to continue and 0 to exit");
        c = sc.nextInt();
    }

    while(c == 1);
}
}