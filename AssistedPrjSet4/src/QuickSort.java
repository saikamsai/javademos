class QuickSort
{
   
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); 
        for (int j=low; j<high; j++)
        { 
            if (arr[j] <= pivot)
            {
                i++;
                // swaping array of i, j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap array of i+1,high
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }



    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {

            int pi = partition(arr, low, high);

            
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    static void printArray(int arr[])
    {
        int len = arr.length;
        for (int i=0; i<len; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = {10, 37, 28, 19, 11, 15};
        int n = arr.length;

        QuickSort obj = new QuickSort();
        obj.sort(arr, 0, n-1);

        System.out.println("sorted array:");
        printArray(arr);
    }
}
