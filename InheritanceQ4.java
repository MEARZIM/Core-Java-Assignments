/**
 * 
 */
package javaAssingment1And2;

/**
* 	An educational institution wishes to maintain a database of its employees. The database is
	divided into a number of classes whose hierarchical relationships are shown below. Write all
	the classes and defines the methods to create the database and retrieve individual information
	as and when needed.
	
	Write a driver program to test the classes.
		Staff (code, name)
		Teacher (subject, publication) is a Staff
		Officer (grade) is a Staff
		Typist (speed) is a Staff
		RegularTypist (remuneration) is a Typist
		CasualTypist (daily wages) is a Typist.
 */

class Staff{
	protected String code;
	protected String name;
	Staff(String code, String name){
		this.code=code;
		this.name=name;
	}
	
	public String toString() {
		return "Staff [code=" + code + ", name=" + name + "]";
	}
}

class Teacher extends Staff{
	private String subject;
	private String publication;
	Teacher(String code, String name,String subject, String publication){
		super(code,name);
		this.subject=subject;
		this.publication=publication;
	}
	
	public String toString() {
		return "Teacher [subject=" + subject + ", publication=" + publication + ", code=" + code + ", name=" + name
				+ "]";
	}
	
	
}

class Officer extends Staff{
	private String grade;
	Officer(String code, String name, String grade){
		super(code,name);
		this.grade=grade;
	}
	
	public String toString() {
		return "Officer [grade=" + grade + ", code=" + code + ", name=" + name + "]";
	}
	
}

class Typist extends Staff{
	protected double speed;
	Typist(String code, String name,double speed){
		super(code,name);
		this.speed=speed;
	}
	
	public String toString() {
		return "Typist [speed=" + speed +"km/h"+ ", code=" + code + ", name=" + name + "]";
	}
	
	
}

class RegularTypist extends Typist{
	private int remuneration;
	RegularTypist(String code, String name,double speed, int remuneration){
		super(code,name,speed);
		this.remuneration=remuneration;
	}
	
	public String toString() {
		return "RegularTypist [remuneration=" + remuneration + ", speed=" + speed +"km/h"+ ", code=" + code + ", name=" + name
				+ "]";
	}
}

class CasualTypist extends Typist{
	private int daily_wages;
	CasualTypist(String code, String name,double speed,int daily_wages){
		super(code,name,speed);
		this.daily_wages=daily_wages;
	}
	
	public String toString() {
		return "CasualTypist [daily_wages=" + daily_wages + ", speed=" + speed +"km/h"+ ", code=" + code + ", name=" + name
				+ "]";
	}
}

public class InheritanceQ4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff s = new Staff("Emp01","Ayan");
		Teacher t =new Teacher("Emp02","Shame","Comp sc","QWE");
		Officer o = new Officer("Emp03","Anil","A+");
		Typist y = new Typist("Emp05","Sunil",123);
		RegularTypist rt = new RegularTypist("Emp06","Ronit kumar Saha",78,21000);
		CasualTypist ct = new CasualTypist("Emp07","A Saha",23,3400);
		System.out.println(s.toString());
		System.out.println(t.toString());
		System.out.println(o.toString());
		System.out.println(y.toString());
		System.out.println(rt.toString());
		System.out.println(ct.toString());
	}

}
/*
 * OutPut->
Staff [code=Emp01, name=Ayan]
Teacher [subject=Comp sc, publication=QWE, code=Emp02, name=Shame]
Officer [grade=A+, code=Emp03, name=Anil]
Typist [speed=123.0km/h, code=Emp05, name=Sunil]
RegularTypist [remuneration=21000, speed=78.0km/h, code=Emp06, name=Ronit kumar Saha]
CasualTypist [daily_wages=3400, speed=23.0km/h, code=Emp07, name=A Saha]

*/
