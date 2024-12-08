package homeWork0812;

public class q5 {

	public static boolean q5(Node<Integer> x,int num)
	{
		Node<Integer> current=x;
		while (current!= null) {
			if(current.getValue()==num)
			{
			return true;
			}
			current=current.getNext(); 

			
	    }
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
