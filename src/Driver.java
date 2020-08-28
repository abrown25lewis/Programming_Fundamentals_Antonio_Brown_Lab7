
public class Driver {

	public static void main(String[] args) {

		int x = 1;

		ArrayStack aStack = new ArrayStack();

		// This is using the instance of the ArrayStack to push integers
		aStack.push(1);
		aStack.push(7);
		aStack.push(3);
		aStack.push(4);
		aStack.push(9);
		aStack.push(2);

		// This While loop will pop off the elements one by one

		while (!aStack.isEmpty()) {
			System.out.println(x + ". pop off Array Stack integer " + aStack.pop());
			x++;
		}

		LinkedStack lStack = new LinkedStack();

		// This is using the instance of the LinkedStack to push integers
		lStack.push(1);
		lStack.push(7);
		lStack.push(3);
		lStack.push(4);
		lStack.push(9);
		lStack.push(2);

		// This While loop will pop off the elements one by one
		while (!lStack.isEmpty()) {
			System.out.println(x + ". pop off Linked Stack integer " + lStack.pop());
			x++;
		}
		LinkedStack lStack2 = new LinkedStack();

		lStack2.push(1);
		lStack2.push(7);
		lStack2.push(3);
		lStack2.push(4);
		lStack2.push(9);
		lStack2.push(2);

		System.out.println(" ");
		lStack2.removeBottomHalf();
		System.out.println("Bottom Half is equal to: " );
		System.out.println(lStack2);

	}

}
