import java.util.*;

class Queue {
	int [] arr;
	int capacity, front, rear;

	Queue (int n){
		capacity = n;
		arr = new int[n];
		front = -1;
		rear = -1;
	}

	void queue(int element){
		if(rear == capacity){
			System.out.println("overflow");
			return;
		}
		if(front == -1 && rear == -1){
			front = 0;
			rear = 0;
		} else {
			rear = rear + 1;
		}
		arr[rear] = element;

		
	}

	void dequeue(){
		if(front == -1 && rear == -1){
			System.out.println("underflow");
			return;
		}
		int val = arr[front];
		System.out.println("element to be removed is" + val);
		if(front == rear){
			front = -1;
			rear = -1;
		} else {
			front = front + 1;
		}
	}


	void display(){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int x = sc.nextInt();
		Queue s = new Queue(x);
		int c = 0;
		do{
			System.out.println("Enter 1 for queue, 2 for dequeue, 3 for display and 4 for exit");
			int ch = sc.nextInt();
			switch(ch){
				case 1: System.out.println("Enter the element");
				int n = sc.nextInt();
				s.queue(n);
				break;

				case 2: s.dequeue();
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
