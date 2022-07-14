package sample;

public class S15loops {

	public static void main(String[] args) {
/*
		System.out.println("manufracturing toys - 1");
		System.out.println("manufracturing toys - 2");
		System.out.println("manufracturing toys - 3");
		System.out.println("manufracturing toys - 4");

		for (int i = 0; i < 10; i++) {
		System.out.println("manufracturing toys: " + i);
		}
		for (int i=10; i>0; i--) {
			System.out.println("value of i= "+i);
		}
		
		for(int i=1; i<=10; i++) {
			System.out.println("value of i= "+i++);
		}*/
		
	/*	for (int i=1; i<=10; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//print all even no's b/w 22 to 98
		
		for(int i=22; i<=98; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
	*/		
			// find the sum of all no's divided by 3&5 b/w 1 to 100
		int sum=0, count=0;
			for(int i=1; i<100; i++) {
				if((i%3==0) && (i%5==0)) {
			
					sum +=i;
					count++;
					}
				if(count==5) {
					break;
				}
				else {
					continue;
				}
				}
			System.out.println("sum: "+sum);
			System.out.println("total number that satisfies the criteria = "+count);
	
	}	

}
