/*
Tim Wang
APCS2 PD4
HW 06 Step 1: Split, Step 2: ?, Step 3: Sorted!. 
2017-2-10
*/

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: 
  Mergesort takes advantage of the fact that a one-time array is always sorted. Mergesort would first check if the array has only 1 item---if true, then it returns the array; if not, then it divides up the array into 2 smaller arrays, and uses recursion to keep dividing it until the array has only 1 item left. After that, the 2 "dividend" sorted arrays return to their "divisor", where it calls the merge method to combine the two sorted arrays into 1 sorted array.  
  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) 
    {
	int[] retarr = new int[a.length + b.length];
	int ctr1 = 0;
	int ctr2 = 0;
	while (ctr1 + ctr2 < retarr.length){
	    if (ctr1 == a.length){
		retarr[ctr1+ctr2] = b[ctr2];
		ctr2++;
	    }
	    else if (ctr2 == b.length){
		retarr[ctr1+ctr2] = a[ctr1];
		ctr1++;
	    }
	    else if (a[ctr1] <= b[ctr2]){
		retarr[ctr1+ctr2] = a[ctr1];
		ctr1++;
	    }
	    else{
		retarr[ctr1+ctr2] = b[ctr2];
		ctr2++;
	    }
	}
	return retarr;
	
    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) 
    {
	if (arr.length <= 1){
	    return arr;
	}
	else{
	    int[] burr = new int[arr.length/2];
	    int[] hooray = new int[arr.length-arr.length/2];
	    for (int x = 0; x < arr.length/2; x++){
		burr[x] = arr[x];
	    }
	    for (int x = arr.length/2; x < arr.length; x++){
		hooray[x-arr.length/2] = arr[x];
	    }
	    return merge(sort(burr), sort(hooray));
	}
		
    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {


	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};

	System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	mess(arr3);
	printArray( arr3 );

	System.out.println("\nMerging arr1 and arr2: ");
	printArray( merge(arr1,arr2) );

	System.out.println("\nMerging arr4 and arr6: ");
	printArray( merge(arr4,arr6) );

	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );

    }//end main()

}//end class MergeSort

