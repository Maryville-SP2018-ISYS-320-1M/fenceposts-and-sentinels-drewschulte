
/*
	ISYS 320

	Name(s):drew schulte
	Date: 
*/

import java.util.Scanner;

public class P1_FindMinAndMax {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		int i = 0;

		while (i >= 0) {
			System.out.print("Type a number (or -1 to stop): ");
			i = console.nextInt();
		}

		System.out.println("Maximum was " + max);
		System.out.println("Minimum was " + min);
	}

}
