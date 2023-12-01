package InterfaceAndPackages;
/**
 *  Create three interfaces, each with two methods. Inherit a new interface from the three,
	adding a new method. Create a class by implementing the new interface and also
	inheriting from a concrete class. Now write four methods, each of which takes one of the
	four interfaces as an argument. In main( ), create an object of your class and pass it to
	each of the methods.
 */

interface Interface1{
	public void Interface1Method1();
	public void Interface1Method2();
}
interface Interface2{
	public void Interface2Method1();
	public void Interface2Method2();
}
interface Interface3{
	public void Interface3Method1();
	public void Interface3Method2();
}

interface NewInterface extends Interface1, Interface2, Interface3{
	public void NewMethod();
}

class ConcreteClass{
	ConcreteClass(){
		System.out.println("ConcreteClass created");
	}
}

class Q1 extends ConcreteClass implements NewInterface{

	@Override
	public void Interface1Method1() {
		// TODO Auto-generated method stub
		System.out.println("In Interface1->Method1 Override");
	}

	@Override
	public void Interface1Method2() {
		// TODO Auto-generated method stub
		System.out.println("In Interface1->Method2 Override");
	}

	@Override
	public void Interface2Method1() {
		// TODO Auto-generated method stub
		System.out.println("In Interface2->Method1 Override");
	}

	@Override
	public void Interface2Method2() {
		// TODO Auto-generated method stub
		System.out.println("In Interface2->Method2 Override");
	}

	@Override
	public void Interface3Method1() {
		// TODO Auto-generated method stub
		System.out.println("In Interface3->Method1 Override");
	}

	@Override
	public void Interface3Method2() {
		// TODO Auto-generated method stub
		System.out.println("In Interface3->Method2 Override");
	}

	@Override
	public void NewMethod() {
		// TODO Auto-generated method stub
		System.out.println("In NewInterface->NewMethod Override");
	}
	
}

public class InterfaceQ1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 ob = new Q1();
		ob.Interface1Method1();
		ob.Interface1Method2();
		ob.Interface2Method1();
		ob.Interface2Method2();
		ob.Interface3Method1();
		ob.Interface3Method2();
	}

}
/*OutPut->
ConcreteClass created
In Interface1->Method1 Override
In Interface1->Method2 Override
In Interface2->Method1 Override
In Interface2->Method2 Override
In Interface3->Method1 Override
In Interface3->Method2 Override
 */