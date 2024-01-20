/**
 * 
 */
package PerviousYear;

/**
 *  Write a program that outputs the name of the capital of the country entered at the 
	command line. The program should throw a “NoMatchFoundException” when it fails 
	to print the capital of the country entered at the command line.  
 */
import java.util.HashMap;
import java.util.Map;

class NoMatchFoundException extends Exception{
	private String errMsg;
	public NoMatchFoundException(String errMsg){
		super();
		this.errMsg = errMsg;
		System.out.println(errMsg);
	}
	
	public String toString() {
		return "Error :"+this.errMsg;
	}
}

public class Q7A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> records = new HashMap<String, String>();
		
		records.put("India", "Delhi");
		records.put("Nepal", "Katmandu");
	
		
		try {
			if(records.containsKey(args[0])) {
				System.out.println( records.get(args[0]) );
			}else {
				throw new NoMatchFoundException("No Match Found");
			}
		}catch(NoMatchFoundException e){
			System.out.println(e.toString());
		}finally {
			
			for(Map.Entry<String, String> pair: records.entrySet()) {
				System.out.println(pair.getKey()+" :"+ pair.getValue());
			}
		}
		
	}

}
