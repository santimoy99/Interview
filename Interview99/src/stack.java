
public class stack {

	 int[] Stack=new int[5];
	int top=0;
	public void push(int i) {
		Stack[top]=i;
		top++;
	}
	public int pop() 
	{
		int data;
		top--;
		data=Stack[top];
		Stack[top]=0;
		return data;
		
	}
	public int peek() {
		
		int data;
		data=Stack[top-1];
		return data;
		
	}
	public int Size() {
		return top;
		
	}
	public boolean isEmpty() {
		return top<=0;
		
	}
	public void show() {
		for(int n:Stack) {
			
			System.out.print(n+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		stack st=new stack();
		System.out.println("Empty "+st.isEmpty());
		st.push(10);
		st.push(16);
		st.push(19);
		st.push(45);
		st.show();
		System.out.println("pop is "+st.pop());
		System.out.println("peek is "+st.peek());
		st.show();
		System.out.println("Empty "+st.isEmpty());
		System.out.println("Size is "+st.Size());
		
	}

}
