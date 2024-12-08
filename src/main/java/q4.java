package homeWork0812;

public class q4 {

	public static void q4(Node<Integer> x)
	{
		Node<Integer> current=x;
		while (current!= null) {
			if(current.getValue()%2==0)
			{
			System.out.println(current.getValue());
			}   
			current=current.getNext(); 
	    }
		
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
