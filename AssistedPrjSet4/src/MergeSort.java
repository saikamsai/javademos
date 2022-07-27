
 class MergeSort {
	    void merging(int arr[], int l, int m, int r)
	    {
	        int n1 = m - l + 1;
	        int n2 = r - m;
	 
	        int L[] = new int[n1];
	        int R[] = new int[n2];
	 
	        for (int i = 0; i < n1; ++i)
	            L[i] = arr[l + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = arr[m + 1 + j];
	 
	 
	        int i = 0, j = 0;
	 
	        int x = l;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[x] = L[i];
	                i++;
	            }
	            else {
	                arr[x] = R[j];
	                j++;
	            }
	            x++;
	        }
	 
	        while (i < n1) {
	            arr[x] = L[i];
	            i++;
	            x++;
	        }
	        while (j < n2) {
	            arr[x] = R[j];
	            j++;
	            x++;
	        }
	    }
	 
	    void sort(int arr[], int l, int r)
	    {
	        if (l < r) {
	            int m =l+ (r-l)/2;
	            sort(arr, l, m);
	            sort(arr, m + 1, r);
	            merging(arr, l, m, r);
	        }
	    }
	    static void printArray(int arr[])
	    {
	        int len = arr.length;
	        for (int i = 0; i < len; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	    public static void main(String args[])
	    {
	        int arr[] = { 12, 11, 13, 25, 6, 17 };
	 
	        MergeSort obj = new MergeSort();
	        obj.sort(arr, 0, arr.length - 1);
	 
	        System.out.println("\nSorted array");
	        printArray(arr);
	    }
}
