/* Example showing how to access an array declared with
 * the PRIVATE access modifier (Arrays and OOP)
 */

import java.util.Arrays;

public class ArrayAccess {
	
	private int[] a;

	public ArrayAccess() { }

	public ArrayAccess(int len) {
		a = new int[len];
	}
	
	public ArrayAccess(int[] array) {
		a = array;
	}

	public int[] getA() {
		return a;
	}

	public int getA(int index) {
		return a[index];
	}

	public void setA(int[] array) {
		a = array;
	}

	public boolean setA(int index, int value) {
		if(index < 0 || index >= a.length) {
			return false;	// index out of bounds error
		}
		a[index] = value;
		return true;
	}

	public String toString() {
		String output = "[" + a[0];
		for(int i = 1; i < a.length; i++) {
			output += ", " + a[i];
		}
		return output + "]";
	}

	// let's assume this is in a different class, i.e. ArrayAccessTest.java
	public static void main (String[] args) {
		int[] x = {1,2,3,4,5};
		int[] z = {5,4,3,2,1};
		System.out.println("int[] x = {1,2,3,4,5};\tint[] z = {5,4,3,2,1};");
		ArrayAccess t = new ArrayAccess( x );
		System.out.println( "ArrayAccess t = new ArrayAccess( x ); t --> " + t );
		// accessing the array using the accessors
		System.out.println("t.getA()[3] --> " + t.getA()[3]);
		System.out.println("t.getA(3)   --> " + t.getA(3));
		x[3] = 6;
		System.out.println( "x[3] = 6; x --> " + Arrays.toString(x) );
		System.out.println( "t --> " + t ); // the array t IS x (look at line #54), not a clone
		t.setA( z );
		System.out.println( "t.setA( z );  t --> " + t );
		t.setA(3, 6);
		System.out.println( "t.setA(3, 6); t --> " + t );
		System.out.println( "z --> " + Arrays.toString(z) );
	}
}

