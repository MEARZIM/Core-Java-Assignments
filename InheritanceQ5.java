/**
 * 
 */
package javaAssingment1And2;

/**
 *  Consider an example of book shop which sells books & video tapes. It’s modeled by Book &
	Tape classes. These two classes are inherited from the abstract class called Media. The Media
	class has common data members such as title & publication. The Book class has data
	member for storing a no. of pages in a book & Tape class has the playing time in a tape. Each
	class will have method such as read ( ) & show ( ). Write a program that models this class
	hierarchy & processes objects using reference to base class only.
 */

abstract class Media{
	protected String title;
	protected String publication;
	
	Media (String title, String publication){
		this.title = title;
		this.publication = publication;
	}
	public abstract void read();
	public abstract void show();
}

class Book extends Media{
	
	private int noOfpages;
	
	Book(String title, String publication ,int noOfpages){
		super(title, publication);
		this.noOfpages = noOfpages;
	}
	
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("The Title of the book is "+ super.title);
	}
	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Book Title : "+ super.title);
		System.out.println("Book Publication : "+ super.publication);
		System.out.println("Page Number : "+ this.noOfpages);
	}
}
class Tape  extends Media{
	
	private int timeOfPlaying;
	
	Tape(String title, String publication ,int noOfpages, int timeOfPlaying){
		super(title, publication);
		this.timeOfPlaying = timeOfPlaying;
	}
	
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("The Title of the book is "+ super.title);
	}
	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Book Title : "+ super.title);
		System.out.println("Book Publication : "+ super.publication);
		System.out.println("Page Number : "+ this.timeOfPlaying);
	}
}

public class InheritanceQ5 {

	/**
	 * @param args
	 */
	public static void objRef(Media m){
		m.read();
		m.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Media books = new Book("Hello Books","Ayan Saha",90);
		Media tapes = new Book("Hello Tapes","Ayan Saha",70);
		
		objRef(books);
		System.out.println();
		objRef(tapes);
	}

}
/*
 * OutPut ->
The Title of the book is Hello Books
Book Title : Hello Books
Book Publication : Ayan Saha
Page Number : 90

The Title of the book is Hello Tapes
Book Title : Hello Tapes
Book Publication : Ayan Saha
Page Number : 70

 */
