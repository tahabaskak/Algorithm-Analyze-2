import java.util.List;

public class executionTime {
	
	public static void exeTime(List<Integer> array , int n){
		long startTime = System.nanoTime();							//Calculating Exe Time
		array = createArrayN.createArray(array, n);					/* create array for second largest element */
		int secondLargestElement = findingSecondLargestElement.findingSecondLargest(array, n);
		long endTime = System.nanoTime();
		long duration = ((endTime - startTime)/1000);				//MilliSecond
		System.out.println("Duration timeN"+n+" : " + duration);
		System.out.println("Second Largest Element : " + secondLargestElement);
	}
	
	public static void exeTimeStoogeSort (List<Integer> array , int n){
		long startTime = System.nanoTime();							//Calculating Exe Time
		array = createArrayN.createArray(array, n);					/* create array for stooge sort */
		array = stoogeSort.stoogeSorting(array, 0, n-1);
		long endTime = System.nanoTime();
		long duration = ((endTime - startTime)/1000000);			//MicroSecond
		System.out.println("Duration timeN"+n+" : " + duration);
	}
	
	public static void exeTimeRadixSort (List<Integer> array, int n){
		long startTime = System.nanoTime();							//Calculating Exe Time
		array = createArrayN.createArrayRandomNumberRange(array, n);	/* create array for radix sort */
		radixSort.radixSorting(array, n);
		long endTime = System.nanoTime();
		long duration = ((endTime - startTime)/1000);				//MilliSecond
		System.out.println("Duration timeN"+n+" : " + duration);
	}
	
	public static void exeTimeShakerSort (List<Integer> array, int n){
		long startTime = System.nanoTime();							//Calculating Exe Time
		array = createArrayN.createArray(array, n);					/* create array for shaker sort */
		shakerSort.shakerSorting(array, n);
		long endTime = System.nanoTime();
		long duration = ((endTime - startTime)/1000);				//MilliSecond
		System.out.println("Duration timeN"+n+" : " + duration);
	}
	
	public static void exeTimeMaximumSubarray(List<Integer> array, int n){
		long startTime = System.nanoTime();							//Calculating Exe Time
		array = createArrayN.createArray(array, n);					/* create array for max sub */
		int max_sum = maximumSubarray.maxSubarray(array, n);		
		long endTime = System.nanoTime();
		long duration = ((endTime - startTime)/1000);				//MilliSecond
		//System.out.println(max_sum);
		System.out.println("Duration timeN"+n+" : " + duration);
	}
	
}