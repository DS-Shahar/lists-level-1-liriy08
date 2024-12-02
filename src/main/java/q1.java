package homework;

public class q1 {

	public static Node<Integer> q1(int x,int y,int n)
	{
		Node<Integer> a = new Node<Integer>((int)(Math.random()*(y-x+1))+x);
		Node<Integer> b=a;
		for(int i=1; i<n; i++)
		{
			b.setNext(new Node<Integer>((int)(Math.random()*(y-x+1))+x));
			b=b.getNext();
		}
		return a;
	}
	
		public static int count2(Node<Integer> p, int x)
		{ int count=0;
			while(p!=null)
			{
				if(p.getValue()==x)
				{
					count++;
				}
				p=p.getNext();
			}
			return count;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=1; int y=20; int n=20;
 Node<Integer> p = q1(x,y, n);
 System.out.println(p);
 int answer= count2(p, 13);
 System.out.println(answer);
	}

}
