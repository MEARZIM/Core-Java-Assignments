package javaAssingment1And2;

import java.util.Scanner;

/**
 * Write a Program in Java to find the sum of all the Prime numbers between a given range of numbers.
 */
public class Ass1Q8 {
	static boolean isPrime(int n) {
		int count=0;
		if(n==1){
			return false;
		}else {
			for (int i=2; i<(n/2);i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count == 0) {
				return true;
			}else {
				return false;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int minRange=0, maxRange=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting range :");
		minRange = sc.nextInt();
		
		System.out.println("Enter the ending range :");
		maxRange = sc.nextInt();
		
		// Validations
		if(minRange <= 0 || maxRange <= 0 ) {
			System.out.println("Starting and ending Range can not be 0 or less than 0");
		}else {
			if (minRange<maxRange) {
				System.out.println("Prime number between "+minRange+" - "+maxRange+" :");
				for (int i= minRange; i<=maxRange; i++) {
					if(isPrime(i)) {
						System.out.print(i+ " ");
					}
				}
			}else {
				System.out.println("Starting range must be greater then ending range");
			}
		}
		sc.close();
	}
}

/*
 * OutPut1 ->
Enter the Starting range :
10
Enter the ending range :
99
Prime number between 10 - 99 :
11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 


 * OutPut2 ->
Enter the Starting range :
999
Enter the ending range :
1999
Prime number between 999 - 1999 :
1009 1013 1019 1021 1031 1033 1039 1049 1051 1061 1063 1069 1087 1091 1093 1097 1103 1109 1117 1123 1129 1151 1153 1163 1171 1181 1187 1193 1201 1213 1217 1223 1229 1231 1237 1249 1259 1277 1279 1283 1289 1291 1297 1301 1303 1307 1319 1321 1327 1361 1367 1373 1381 1399 1409 1423 1427 1429 1433 1439 1447 1451 1453 1459 1471 1481 1483 1487 1489 1493 1499 1511 1523 1531 1543 1549 1553 1559 1567 1571 1579 1583 1597 1601 1607 1609 1613 1619 1621 1627 1637 1657 1663 1667 1669 1693 1697 1699 1709 1721 1723 1733 1741 1747 1753 1759 1777 1783 1787 1789 1801 1811 1823 1831 1847 1861 1867 1871 1873 1877 1879 1889 1901 1907 1913 1931 1933 1949 1951 1973 1979 1987 1993 1997 1999 


 * OutPut3 ->
Enter the Starting range :
--10
Enter the ending range :
--1
Starting and ending Range can not be 0 or less than 0


 * OutPut4 ->
Enter the Starting range :
100
Enter the ending range :
10
Starting range must be greater then ending range


 */
