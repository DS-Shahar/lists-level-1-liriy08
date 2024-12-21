package homework3;


public class q6 {

	public static Node<Integer> q6(int num, Node<Integer> x)
	{
		Node<Integer> head=x;
		if (head == null) {
            return head;  
        }

       
        if (head.getValue().equals(num)) {
            head = head.getNext();
            return head;
        }

            
        Node<Integer> current = head;
        while (current.hasNext() && current.getNext() != null) {
            if (current.getNext().getValue().equals(num)) {
                current.setNext(current.getNext().getNext());
                return head;
            }
            current = current.getNext();
        }
        return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
