package ExceptionDemo;

class StackOverflow extends Exception
{
	public String toString()
	{
		return "Stack is Full";
	}
}
class StackUnderflow extends Exception
{
	public String toString()
	{
		return "Stack is Empty";
	}
}
class Stack 
{
	private int Size;
	private int Top=-1;
	private int S[];
	
	public Stack(int sz)
	{
		Size=sz;
		S=new int[sz];
	}
	public void push(int x) throws StackOverflow
	{
		if (Top==Size-1)
			throw new StackOverflow();
		Top++;
		S[Top]=x;
	}
	public int pull() throws StackUnderflow
	{
		int x=-1;
		if (Top==-1)
			throw new StackUnderflow();
		Top--;
		return x;
	}
}
public class StudentChallenge1 {

	public static void main(String[] args) {
		Stack st=new Stack(5);
        try
        {
        st.push(10);
        st.push(15);
        st.push(10);
        st.push(15);
        st.push(10);
        st.push(15);
        
        }
        catch(StackOverflow s)
        {
            System.out.println(s);
        }
	}
}
