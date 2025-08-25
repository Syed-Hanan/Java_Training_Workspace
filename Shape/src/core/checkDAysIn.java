package core;

import java.util.Scanner;

public class checkDAysIn {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter month");
		String monthInput=sc.nextLine().toUpperCase();
		
		try {
			Months month=Months.valueOf(monthInput);
			int days;
			switch(month) {
			
			case JAN,MAR,MAY,JULY,SEP,NOV:days=31;
			break;
			case APR,JUN,AUG,OCT,DEC:days=30;
			break;
			case FEB:days=28;
			break;
			default:
				throw new IllegalArgumentException();
			}
			System.out.println("number of daya in the given month "+ " "+month+" "+"is"+" "+days);
		}
		catch(IllegalArgumentException e) {
			System.out.println("not a valid month");
		}
		
		
		sc.close();

	}

}
