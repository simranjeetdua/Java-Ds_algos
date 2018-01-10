package ds.stack;

public class Stack {
	private int maxSize;// max size of the array
	private char[] stackArray;// container array
	private int top;// very important for indexing

	public Stack(int size) {
		this.maxSize = size;// max size will be equal to the size entered by the user
		this.stackArray = new char[maxSize];
		this.top = -1; // as the array is empty right now

	}

	public void push(char j)// add new element
	{	if(isFull()) //to check if the the stack is full
	{
		System.out.println("The stack is already full");
	}
	else {
		top++;// increased the value of top to accommodate new element
		stackArray[top] = j;
	}
		
	}

	public char pop() // take out the topmost element
	{	if(isEmpty()) // to check if the stack is empty
	{
		System.out.println("The stack is already empty");
		return 0;
	}else {
		int oldTop = top;// storing the value of top before changing so that it can be returned
		top--;
		return stackArray[oldTop];
	}
		
	}

	public char peak()// let the user take sneak peak of the topmost element
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
