/*
Team Honya- Allan Wang, Tim Wang, Gian Tricarico
APCS2 PD4
HW 07 What Does the Data Say?
2017-2-14
*/

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

  O(n * log(n))

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 1
  n=10      time: 40
  n=100     time: 700
  ...
  n=<huge>  time: n*log(n)

  ANALYSIS:

  The MergeSort Algorithm runs in O(n*log(n)). To analyze this we divide the algo into two halves. The first half of the algo divide the given array of length n into single-item array. We can relate this step to the BinarySearch algorithm where we also have an algo that, in its worst case, limit the bounds of the array by dividing by its midpoints until there's only 1 item left. Same as BinarySearch, the Big-Oh of the first half is O(log(n))
  The second half deals with merging two sorted arrays into one. Here, the algo traverses the two arrays with two array counters, and by using a while loop, compares the two arrays' item at their counters. The while loop is O(n), and comparing is O(1), so this half is O(n).
  So the whole MergeSort Algo has a runtime of O(n*log(n)).
  ======================================*/

public class MergeSortTester
{
    public static double[] runTime(int length, int tries){
      int[] arr = new int[length];
      double[] times = new double[tries];
      long startTime;
      long endTime;
      for (int i=0; i<tries; i++){
        startTime = System.nanoTime();
        MergeSort.sort(arr);
        endTime = System.nanoTime();
        times[i] = ((double)(endTime-startTime)) * Math.pow(10,-9);
      }
      return times;
    }

    public static double avgTime(int length, int tries){
      double[] times = runTime(length,tries);
      double total = 0;
      //add totals of test length
      for (int i=0; i<times.length; i++){
        total += times[i];
      }
      //return average
      return total / times.length;
    }

    //avg time for 100 tests
    public static double avg(int length) {
      return avgTime(length, 10);
    }


    /******************************
     * execution time analysis
     Created a set of test case arrays with size 10* greater than
     the previous array. For each, the mean of 1000 tests calculated
     for an average execution time. Sort each array 1000 times, and
     find the total time by calculating the difference between end and
     start time for each. This is added up for a total and averaged.
     ******************************/
    public static void main( String[] args )
    {
      int[] start = new int[100];
      MergeSort.sort(start);
      int[] testarrs = {1,10,100,1000,10000,100000,1000000,10000000, 100000000};
      for (int test: testarrs){
        System.out.println(""+test+", "+ avg(test) +" seconds");
      }

      /*
      int[] arr0 = new int[1];
      int[] arr1 = new int[10];
      int[] arr2 = new int[100];
      int[] arr3 = new int[1000];
      int[] arr4 = new int[10000];
      int[] arr5 = new int[100000];
      int[] arr6 = new int[1000000];
      int[] arr7 = new int[10000000];
      int[] arr8 = new int[100000000];

      long start, test, a, b, c, d, e, f, g, h;
      start = System.nanoTime();
      MergeSort.sort(arr0);
      test = System.nanoTime();
      MergeSort.sort(arr1);
      a = System.nanoTime();
      MergeSort.sort(arr2);
      b = System.nanoTime();
      MergeSort.sort(arr3);
      c = System.nanoTime();
      MergeSort.sort(arr4);
      d = System.nanoTime();
      MergeSort.sort(arr5);
      e = System.nanoTime();
      MergeSort.sort(arr6);
      f = System.nanoTime();
      MergeSort.sort(arr7);
      g = System.nanoTime();
  //    MergeSort.sort(arr8);
  //    h = System.currentTimeMillis();

      System.out.println("Array 1 took "+(a-test)*Math.pow(10,-9)+"seconds to sort");
      System.out.println("Array 2 took "+(b-a)*Math.pow(10,-9)+"seconds to sort");
      System.out.println("Array 3 took "+(c-b)*Math.pow(10,-9)+"seconds to sort");
      System.out.println("Array 4 took "+(d-c)*Math.pow(10,-9)+"seconds to sort");
      System.out.println("Array 5 took "+(e-d)*Math.pow(10,-9)+"seconds to sort");
      System.out.println("Array 6 took "+(f-e)*Math.pow(10,-9)+"seconds to sort");
      System.out.println("Array 7 took "+(g-f)*Math.pow(10,-9)+"seconds to sort");
  //    System.out.println("Array 8 took "+(h-g)+"mil to sort");
*/
    }//end main

}//end class
