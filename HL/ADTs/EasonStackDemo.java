// --- stack definition ---

class StringStack {
	private String[] data;
	private int end;

	StringStack() {
		this.data = new String[10];
		this.end = 0;
	}

	public int size() {
		// returns count of populated elements
		return end;
	}

	public boolean isFull() {
		return data.length == end;
	}

	public void push(String newData) {
		if (end >= this.data.length) {
			System.err.println("Stack full, OVERFLOW");
			return;
		}
		
		this.data[end] = newData;
		end = end + 1;
	}

	public String pop() {
		if (end == 0) {
			System.err.println("Stack empty, UNDERFLOW");
			return null;
		}
		
		end = end - 1;
		String result = this.data[end];
		this.data[end] = null; // Erase the previous data
		return result;
	}

	public String top() {
		if (end == 0) {
			System.err.println("Stack is empty, cannot fetch top.");
			return null;
		}

		return this.data[end - 1];
	}

	public void printStack() {
		System.out.println("=== TOP ===");
		for (int i = end-1; i >= 0; i--) {
			System.out.println(this.data[i]);
		}
		System.out.println("=== BOT ===");
	}
}

// --- end stack definition ---



public class EasonStackDemo {
	public static void main(String[] args) {
		// Make a stack
		var stack = new StringStack();
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Grape");
		stack.push("Orange");

		stack.printStack();

		int count = stack.size();
		for (int i = 0; i < count; i++) {
			String current = stack.pop();
			System.out.println("#"+i+" pop: " + current);
		}
		
		// Push some stuff on first
	}

}
