
public class Matrix4 {
	public static void main(String[] args) {
		int r1 = 2, c1 = 3;
        @SuppressWarnings("unused")
		int r2 = 3, c2 = 2;
		int a[][]= { {13, -2, 5}, {3, 0, 4} };
		int b[][]= { {2, 13}, {-5, 0}, {0, 4} };
		int p[][]=new int[3][3];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				p[i][j]=0;
				for(int k=0;k<c1;k++) {
					p[i][j]+=a[i][k] * b[k][j];
				}
				
			}
		}
		
		System.out.println("Multiplication of two matrices is: ");
        for(int[] row : p) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
		
