package homeWork0812;

public class q2 {

	public static void q2( Node<Integer> a)
	{
		 Node<Integer> current=a;
		 while (current!= null) {
		        System.out.println(current.getValue());  
		        current=current.getNext(); 
		    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
