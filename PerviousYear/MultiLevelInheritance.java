package PerviousYear;

class A {
	A(){
		System.out.println("A");
	}
}

class B extends A{
	B(){
		System.out.println("B");
	}
}

class C extends B{
	C(){
		System.out.println("C");
	}
}

public class MultiLevelInheritance {
	public static void main (String[] args) {
		B obj  = new C();
		System.gc();
	}
}

/*  
A
B
C
*/
