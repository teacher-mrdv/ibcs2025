class CounterUpper {
    static void countEvens(int end) {
        // Functions: no space.
        // Control flow: space. (while if dowhile)
        for (int i = 0; i < end; i++) {
            if (i % 2 == 0) {
				System.out.println(i);
            }
        }
    }
}
public class HowToWriteJava {
	public static void main(String[] args) {
		CounterUpper.countEvens(20);
	}
}
