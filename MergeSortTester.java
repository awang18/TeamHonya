/*======================================
  class MergeSortTester

  ALGORITHM:
  Taking advantage of the fact that an element with one array is always sorted,
  MergeSort utilizes recursion to sort an inputed array. The algorithm contintually
  checks if an array has only 1 item--if true, then that array is returned; if not,
  the array is split into 2 smaller arrays, and the algorithm uses recursion to
  continue dividing the arrays until only arrays of length 1 remain. After that,
  the arrays are continually merged from pairs and sorted in ascending order until
  all the arrays have been remerged and sorted into a single array of the same length
  as the original input.


  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time:
  n=10      time:
  n=100     time:
  ...
  n=<huge>  time:

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester
{

    /******************************
     * execution time analysis
     Created a set of test case arrays with size 10* greater than
     the previous array. Would record the System currentTimeMillis,
     run the code, and check for the System currentTimeMillis afterwards,
     then subtract before and after.
     ******************************/
    public static void main( String[] args )
    {
      int[] arr1 = new int[10];
      int[] arr2 = new int[100];
      int[] arr3 = new int[1000];
      int[] arr4 = new int[10000];
      int[] arr5 = new int[100000];
      int[] arr6 = new int[1000000];

      long start, a, b, c, d, e, f, g;
      start = System.currentTimeMillis();
      MergeSort.sort(arr1);
      a = System.currentTimeMillis();
      MergeSort.sort(arr2);
      b = System.currentTimeMillis();
      MergeSort.sort(arr3);
      c = System.currentTimeMillis();
      MergeSort.sort(arr4);
      d = System.currentTimeMillis();
      MergeSort.sort(arr5);
      e = System.currentTimeMillis();
      MergeSort.sort(arr6);
      f = System.currentTimeMillis();

      System.out.println("Array 1 took "+(a-start)+"mil to sort");
      System.out.println("Array 2 took "+(b-a)+"mil to sort");
      System.out.println("Array 3 took "+(c-b)+"mil to sort");
      System.out.println("Array 4 took "+(d-c)+"mil to sort");
      System.out.println("Array 5 took "+(e-d)+"mil to sort");
      System.out.println("Array 6 took "+(f-e)+"mil to sort");


    }//end main

}//end class
