package sample;

public class S16while {

	public static void main(String[] args) {
		/*
		 * int i = 11;
		 * 
		 * while (i <= 10) { System.out.println(i); i++; }
		 */
		/*
		 * do { System.out.println(i); i++; }while(i<=10);
		 */

		/*
		 * for (int i1 = 1; i1 <= 10; i1++) { for (int j = 1; j <= i1; j++) {
		 * System.out.print("*"); } System.out.println(i1); }
		 */
		
		// 1.print no's upto 7 using while loop
		
		
		int x = 1;
		while (x <= 7) {
			System.out.println(x);
			x++;
		}
		
		// 2. calculate sum of no's from 1 to 7, using while loop
		int y=1, sum = 0;
		while(y<=7) {
		
			sum=sum+y;
			y++;}
			System.out.println("SUM is: " + sum);
		

	}

}
