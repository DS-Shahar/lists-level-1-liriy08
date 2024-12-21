package homework3;

public class q11 {
	public static Node<Integer> q11(Node<Integer> L1, Node<Integer> L2) {
        if (L1 == null) {
            return null;
        }

        Node<Integer> x = new Node<Integer>(0, L1);
        Node<Integer> current = x;

        while (current.getNext() != null) {
            if (isInList(current.getNext().getValue(), L2)) {
                current.setNext(current.getNext().getNext());
            } 
            else {
                current = current.getNext();
            }
        }

        return x.getNext(); 
    }

    public static boolean isInList(Integer value, Node<Integer> list) {
        Node<Integer> current = list;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return true; 
            }
            current = current.getNext();
        }
        return false; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
