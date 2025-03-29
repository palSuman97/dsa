package queue;

public class CircularQUsingArray {

	int[] a;
	int front;
	int rear;
	
	public CircularQUsingArray(int length) {
		this.a = new int[length];
		this.front = -1;
		this.rear = -1;
	}
	
	void enQueue(int data) {
		
		if(front == (rear+1)%a.length)
			System.out.println("Queue is Full!!");
		else if(front == -1 && rear == -1) {
			front++;
			a[++rear] = data;
		}
		else if(rear == a.length-1) {
			rear = 0;
			a[rear] = data;
		}
		else {
			a[++rear] = data;
		}
	}
	
	void deQueue() {
		
		if(front==-1)
			System.out.println("Queue is Empty");
		else if(front == rear){
			front = -1;
			rear = -1;
		}
		else if (front == a.length-1) {
			front = 0;
		}
		else {
			front++;
		}
	}
	
	void printQ() {
		
		if(front<rear)	{
			for(int i = front; i<=rear;i++)
				System.out.print(a[i]+" ");
		}
		else if (front == rear) {
			System.out.print(a[front]);
		}
		else {
			for(int i=front;i<a.length;i++)
				System.out.print(a[i]+" ");
			for(int i=0;i<=rear;i++)
				System.out.print(a[i]+" ");
		}
	}
}
