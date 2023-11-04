/**
 * 
 */
package javaAssingment1And2;

import java.util.Scanner;

/**
 *  An election is contested by 5 candidates. The candidates are numbered 1-5 and the voting
	is done by marking the candidate number on the ballot paper. Write a program to read the
	ballots and count the votes casts for each candidate using an array variable count. In case,
	a number read is outside the range 1 – 5, the ballot should be considered as a ‘spoilt ballot’
	and the program should also count the number of spoilt ballot.
 */
public class Ass2Q8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of ballet papers ? ");
		int n = sc.nextInt();
		int b[] = new int[7];
		
		System.out.println("Press 1 for give vote to candidate 1");
		System.out.println("Press 2 for give vote to candidate 2");
		System.out.println("Press 3 for give vote to candidate 3");
		System.out.println("Press 4 for give vote to candidate 4");
		System.out.println("Press 5 for give vote to candidate 5");
		
		System.out.println("Please enter the candidate no of the ballot papers : ");
		for(int i=1;i<=n;i++) {
			System.out.print("At ballot paper "+i+" : ");
			int x = sc.nextInt();
			if(x==1) {
				b[x]+=1;
			}else if(x==2) {
				b[x]+=1;
			}else if(x==3) {
				b[x]+=1;
			}else if(x==4) {
				b[x]+=1;
			}else if(x==5) {
				b[x]+=1;
			}else {
				b[6]+=1;
			}
		}
		sc.close();
		
		System.out.println("Counting of the votes : ");
		for(int i=1;i<=6;i++) {
			if(i>=1 && i<=5)
				System.out.println("Candidate"+i+" : "+b[i]);
			else
				System.out.println("Spoilt ballot = "+b[6]);
		}

	}

}
/*
 * Output 1->

No. of ballet papers ? 
6
Press 1 for give vote to candidate 1
Press 2 for give vote to candidate 2
Press 3 for give vote to candidate 3
Press 4 for give vote to candidate 4
Press 5 for give vote to candidate 5
Please enter the candidate no of the ballot papers : 
At ballot paper 1 : 1
At ballot paper 2 : 1
At ballot paper 3 : 3
At ballot paper 4 : 2
At ballot paper 5 : 4
At ballot paper 6 : 2
Counting of the votes : 
Candidate1 : 2
Candidate2 : 2
Candidate3 : 1
Candidate4 : 1
Candidate5 : 0
Spoilt ballot = 0



  *Output 2->

No. of ballet papers ? 
10
Press 1 for give vote to candidate 1
Press 2 for give vote to candidate 2
Press 3 for give vote to candidate 3
Press 4 for give vote to candidate 4
Press 5 for give vote to candidate 5
Please enter the candidate no of the ballot papers : 
At ballot paper 1 : 1
At ballot paper 2 : 23
At ballot paper 3 : 2
At ballot paper 4 : 9
At ballot paper 5 : 8
At ballot paper 6 : 7
At ballot paper 7 : 5
At ballot paper 8 : 4
At ballot paper 9 : 3
At ballot paper 10 : 2
Counting of the votes : 
Candidate1 : 1
Candidate2 : 2
Candidate3 : 1
Candidate4 : 1
Candidate5 : 1
Spoilt ballot = 4

*/