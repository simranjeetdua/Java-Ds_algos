package ds.stack;
import java.util.*;
public class App {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		Stack theStack = new Stack(10);//creating the stack and putting maxSize=10
		
		//adding elements into the stack using push operations down below
		
		/*theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);*/
		
		//popping each element of stack using isEmpty method to check.
		while(!theStack.isEmpty()) {
			long value= theStack.pop();
			System.out.println(value);//the topmost value is printed using loop
		}
		
		String str="hello";
				
		

	}
	public String str="hello";
	public static String reverseString(String str) {
		
		str.split("");
		return str;
	}
	

}
