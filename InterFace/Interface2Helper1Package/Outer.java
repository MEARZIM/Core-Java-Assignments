/**
 * 
 */
package Interface2Helper1Package;
import Interface2MainInerface.MainInterface;

/**
 * 
 */
public class Outer {

	/**
	 * @param args
	 */
	protected class Inner implements MainInterface{
		
		public Inner(){
			System.out.println("InnerClass Created");
		}
		@Override
		public void details() {
			// TODO Auto-generated method stub
			System.out.println("------------------------------------------");
			System.out.println("Package Name - >Interface2Helper1Package\nInterface Merhod Override In InnerClass");
			System.out.println("------------------------------------------");
		}
		
	}

}
