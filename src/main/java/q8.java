package homework3;

public class q8 {

    public static boolean q8(Node<Integer> L1, Node<Integer> L2) {
        if (L1 == null) {
            return true;
        }

        Node<Integer> currentL1 = L1;
        while (currentL1 != null) {
            if (isInList(currentL1.getValue(), L2)==0) {
                return false; }
            
            currentL1 = currentL1.getNext();
        }

        return true; 
    }

    public static int isInList(Integer value, Node<Integer> list) {
        Node<Integer> current = list;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return 1; 
            }
            current = current.getNext();
        }
        return 0; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
