// This class implements a Stack ADT as a linked list
public class LinkedStack {
	LinkedNode front; // Reference to the first LinkedNode in the list
	int count; // Number of nodes in the list

	// Constructor - initializes the front and count variables
	LinkedStack() {
		front = null;
		count = 0;
	}

	// Implements the push operation
	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
		newNode.next = front;
		front = newNode;
		count++;
	}

	// Implements the pop operation
	int pop() {
		int x = front.x;
		front = front.next;
		count--;
		return x;
	}

	// Implements the peek operation
	int peek() {
		return front.x;
	}

	// Implements the isEmpty operation
	boolean isEmpty() {
		return front == null;
	}

	// Implements the size operation
	int size() {
		return count;
	}

	// This method returns a String containing
	// a space separated representation of the underlying linked list
	public String toString() {
		String str = "";

		LinkedNode cur = front;
		while (cur != null) {
			str += cur.x + " ";
			cur = cur.next;
		}

		return str;
	}

	public void removeBottomHalf() {

		int removeHalf = count / 2;

		if (isEmpty()) {

			System.out.println("Empty Stack");

		}

		for (int i = 0; i < removeHalf; i++) {

			// These will assign the two pointers necessary to traverse the list
			LinkedNode lastInList = front;
			LinkedNode bLast = null;

			// The while loop takes and rearranges the order of the list
			while (lastInList.next != null) {
				bLast = lastInList;
				lastInList = lastInList.next;
			}

			// removes last node from linked stack
			bLast.next = null;
			
			
			/* The Time complexity for the following is O(n) and this is due to the fact the 
			 * the second and third loop are O(n/2). Making it so the complexity is always dependent on n.
			 */
		}
	}

}
