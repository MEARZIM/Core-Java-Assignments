/**
 * 
 */
package javaAssignment4And3;

/**
 *  Write a program that defines a class with one static variable called cnt. Create two or more
	objects of the class. The class also contains a method that increments the cnt variable
	whenever a new instance of the class is created. Write a driver class to test the above class.
 */
class TestStatic{
	private static int cnt;
	
	TestStatic(){
		cnt++;
		System.out.println("New instance of the class is created");
	}

	@Override
	public String toString() {
		return "Number of instance of a class: "+ TestStatic.cnt;
	}
	
	
}

public class Ass4q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStatic ref1 = new TestStatic();
		System.out.println(ref1);
		TestStatic ref2 = new TestStatic();
		System.out.println(ref2);
		TestStatic ref3 = new TestStatic();
		System.out.println(ref3);
		TestStatic ref4 = new TestStatic();
		System.out.println(ref4);
		TestStatic ref5 = new TestStatic();
		System.out.println(ref5);
		
	}
	
}

/*
 * OutPut 1->

New instance of the class is created
Number of instance of a class: 1
New instance of the class is created
Number of instance of a class: 2
New instance of the class is created
Number of instance of a class: 3
New instance of the class is created
Number of instance of a class: 4
New instance of the class is created
Number of instance of a class: 5

*/
