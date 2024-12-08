package homeWork0812;

import java.util.Scanner;


public class q3 {
public static Scanner reader=new Scanner(System.in);
	public static Node<Integer> q3()
	{	Node<Integer> a= null;
		Node<Integer> b= null;
		System.out.println("please enter a number");
		int answer=reader.nextInt();
		
		while(answer!=-1)
		{
			Node<Integer> newNode = new Node<Integer>(answer);
			
			if(a==null)
			{
				a=newNode;
				b=newNode;
			}
			else
			{
				b.setNext(newNode);
				b=newNode;
			}
			System.out.println("please enter a number");
			answer=reader.nextInt();
		}
		return a;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
