/**
 * 
 */
package javaAssignment4And3;

/**
 *  Create a class containing an inner class that itself contains an inner class. Repeat this using
	static inner class. What are the names of the .class files produced by the compiler?
 */

//Outer class
class OuterClass {
	
	
	//OuterClass constructor 
	OuterClass() {
		System.out.println("In OuterClass");
		System.out.println("All Classes Created");
	}

	// Inner class
	public class InnerClass {
		
	     
		//constructor InnerClass
	    InnerClass() {
	    	System.out.println("In OuterClass's InnerClass");
		}

		// Innermost class
	    public class InnermostClass {

	    	//  constructor Innermost class
			InnermostClass() {
				System.out.println("In OuterClass's InnerClass's Innermost class");
			}
	    	 
	    }
	}
	
	// Static inner class
	public static class StaticInnerClass {
	
		
		// constructor StaticInnerClass
	    public StaticInnerClass() {
	    	System.out.println("In OuterClass's StaticInnerClass");
		}

		// Static innermost class
	    public static class StaticInnermostClass {

	    	//  constructor StaticInnermostClass
			public StaticInnermostClass() {
				System.out.println("In OuterClass's InnerClass's StaticInnermostClass");
			}
	    	
	    }
	}
}

public class Ass4q5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass o = new OuterClass();
		
		//  The '$' character is used to denote inner classes within the file naming convention.
		/*
		All Classes name that Create inside the bin(D:\JAVA\core-java\javaAssignment4And3\bin\javaAssignment4And3)
		OuterClass.class
		OuterClass$InnerClass.class
		OuterClass$InnerClass$InnermostClass.class
		OuterClass$StaticInnerClass.class
		OuterClass$StaticInnerClass$StaticInnermostClass.class 
		*/
	}

}
