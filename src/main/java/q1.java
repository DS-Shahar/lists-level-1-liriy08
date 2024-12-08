package homeWork0812;



public class q1 {

	public static Node<Integer> q1(int []a )
	{
		if(a.length==0)
		{
			return null;
		}
		int i=0;
		Node<Integer> b = new Node<Integer> (a[0]);
		Node<Integer> c=b;
		
			for(i=1; i<a.length; i++)
			{
			c.setNext(new Node<Integer>(a[i]));
			c=c.getNext();
			}
		
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
