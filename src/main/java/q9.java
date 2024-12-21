package homework3;

public class q9 {

	  public static void q9(Node<Integer> L1, Node<Integer> L2) {
	        Node<Integer> currentL1 = L1;

	        while (currentL1 != null) {
	            if (isInList(currentL1.getValue(), L2)) {
	                System.out.println(currentL1.getValue());
	            }
	            currentL1 = currentL1.getNext();
	        }
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
