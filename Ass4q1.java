/**
 * 
 */
package javaAssignment4And3;

/**
 *  Create a class called Time that has separate data member for hours, minutes and seconds.
	Define member functions to perform the following tasks:
	to display the time in the format hh: mm: ss.
	to add times passed as arguments.
	to check which among two times passed as arguments is greater.
	Write a program to test the class and its functions. Use constructor to initialize the instance
	variables of the class Time.
 */
class Time{
	private int hours;
    private int minutes;
    private int seconds;

   
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Display the time in the format hh:mm:ss
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    // Times passed as arguments
    public Time addTime(Time time2) {
    	// Covert them into second and plus them
        int totalSeconds = this.hours * 3600 + this.minutes * 60 + this.seconds;
        totalSeconds += time2.hours * 3600 + time2.minutes * 60 + time2.seconds;
        
        // now calculate the New time
        int newHours = totalSeconds / 3600;
        int newMinutes = (totalSeconds % 3600) / 60;
        int newSeconds = totalSeconds % 60;
        
        // return as a object
        return new Time(newHours, newMinutes, newSeconds);
    }

    // Check which among two times passed as arguments is greater
    public boolean isGreaterThan(Time time2) {
        int totalThis = this.hours * 3600 + this.minutes * 60 + this.seconds;
        int totalOther = time2.hours * 3600 + time2.minutes * 60 + time2.seconds;

        return totalThis > totalOther;
    }
}
public class Ass4q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time1 = new Time(7, 33, 41);
        Time time2 = new Time(13, 15, 20);

        // Display the times
        System.out.println("Time 1:");
        time1.displayTime();

        System.out.println("\nTime 2:");
        time2.displayTime();

        // Add times
        Time sumTime = time1.addTime(time2);
        System.out.print("\nSum of Time 1 and Time 2 -> ");
        sumTime.displayTime();

        // Compare times
        if (time1.isGreaterThan(time2)) {
            System.out.println("\nTime 1 is greater than Time 2.");
        } else {
        	System.out.println("\nTime 2 is greater than Time 1.");
        }
	}

}

/*
 * OutPut:->
Time 1:
07:33:41

Time 2:
13:15:20

Sum of Time 1 and Time 2 -> 20:49:01

Time 2 is greater than Time 1.

 */