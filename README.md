# TeamHonya
MergeSort is our implementation of the merge sort algorithm, originally developed by John von Neumann. We explain the algorithm in comments within the java file.

We assembled MergeSortTester to help determine the runtime for merge sort. To do this, we assembled several arrays of lenghts increasing by a factor of 10. We ran merge sort on each of them, taking the current time in milliseconds at the beginning and after each sort. To determine the runtime of each individual sort, we subtracted the time before from the time after.

# Analysis:
  
The MergeSort Algorithm runs in O(n\*log(n)). To analyze this we divide the algo into two halves. The first half of the algo divide the given array of length n into single-item array. We can relate this step to the BinarySearch algorithm where we also have an algo that, in its worst case, limit the bounds of the array by dividing by its midpoints until there's only 1 item left. Same as BinarySearch, the Big-Oh of the first half is O(log(n))
The second half deals with merging two sorted arrays into one. Here, the algo traverses the two arrays with two array counters, and by using a while loop, compares the two arrays' item at their counters. The while loop is O(n), and comparing is O(1), so this half is O(n).
So the whole MergeSort Algo has a runtime of O(n\*log(n)).
