package ds.stack;

public class Stack {
	private int maxSize;// max size of the array
	private long[] stackArray;// container array
	private int top;// very important for indexing

	public Stack(int size) {
		this.maxSize = size;// max size will be equal to the size entered by the user
		this.stackArray = new long[maxSize];
		this.top = -1; // as the array is empty right now

	}

	public void push(long j)// add new element
	{
		System.out.println("The stack is already full");
	}
	else {
		top++;// increased the value of top to accommodate new element
		stackArray[top] = j;
	}
		
	}

	public long pop() // take out the topmost element
	{	if(isEmpty()) // to check if the stack is empty
	{
		System.out.println("The stack is already empty");
		return -1;
	}else {
		int oldTop = top;// storing the value of top before changing so that it can be returned
		top--;
		return stackArray[oldTop];
	}
		
	}

	public long peak()// let the user take sneak peak of the topmost element
	{
		return stackArray[top];
	}

	public boolean isEmpty()// to check if our stack is empty
	{
		return (top == -1);// if the stack is empty top=-1, as initialized
	}
	
	public boolean isFull()// to check if our stack is full
	{
		return(maxSize-1==top);//maxSize-1 will be
	}

}
