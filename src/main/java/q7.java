package homework3;

public class q7 {

	public static Node<Integer> q7(int x, Node<Integer> head) {
        if (head == null || x < 1) {
            return head; }

        if (x == 1) {
            return head.getNext(); }
        
        Node<Integer> current = head;
        for (int i = 1; i < x - 1; i++) {
            if (current.getNext() == null) {
                return head; }
            current = current.getNext();
        }

        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
        }

        return head; }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
