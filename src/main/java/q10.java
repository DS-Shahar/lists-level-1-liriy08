package homework3;

public class q10 {
	
    public static Node<Integer> q10(Node<Integer> L1, Node<Integer> L2) {
        Node<Integer> x = new Node<>(0); 
        Node<Integer> tail = x; 
        Node<Integer> currentL1 = L1;
        while (currentL1 != null) {
            if (isInList(currentL1.getValue(), L2)) {
                tail.setNext(new Node<>(currentL1.getValue()));
                tail = tail.getNext();
            }
            currentL1 = currentL1.getNext();
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
