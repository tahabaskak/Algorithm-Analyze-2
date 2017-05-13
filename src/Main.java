import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> arrayLenghts = new ArrayList<Integer>();
		arrayLenghts = createArrayN.createArrayDeafult(arrayLenghts);

		while(true){
			try{				/*Menu include algorithms , choose one by the users*/
				System.out.println("Chose one and input number\n"
						+ "1.Finding Second Largest\n"
						+ "2.Stooge Sort\n"
						+ "3.Radix Sort\n"
						+ "4.Shaker Sort\n"
						+ "5.Maximum Subarray\n"
						+ "6.Exit Program\n");
				BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		        String s = bufferRead.readLine();
		        if(Integer.parseInt(s) == 1){
		        	firstAlgoritm(arrayLenghts);		/*Go to findingSecondLargestElement function*/
		        }
		        else if(Integer.parseInt(s) == 2){
		        	stoogeSortAlgorithm(arrayLenghts);	/*Go to stooge sort function*/
		        }
		        else if(Integer.parseInt(s) == 3){		/*Random number range 5000*/
		        	radixSortAlgorithm(arrayLenghts);	/*Go to radix sort function*/
		        }
		        else if(Integer.parseInt(s) == 4){
		        	shakerSortAlgorithm(arrayLenghts);	/*Go to shaker sort function*/
		        }
		        else if(Integer.parseInt(s) == 5){
		        	maximumSubarrayAlgorithm(arrayLenghts);	/*Go to maxSub  function*/
		        }
		        else if(Integer.parseInt(s) == 6){
		        	System.out.println("Exit");			/* Program exit */
		        	break;
		        }	        
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void firstAlgoritm(List<Integer> arrayLenghts){
		List<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<arrayLenghts.size();i++){			/* calculating this algorithm for All N value */
			executionTime.exeTime(array, arrayLenghts.get(i));
		}
	}

	public static void stoogeSortAlgorithm(List<Integer> arrayLenghts){
		List<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<arrayLenghts.size();i++){		/* calculating this algorithm for All N value */
			executionTime.exeTimeStoogeSort(array, arrayLenghts.get(i));
		}
	}

	public static void radixSortAlgorithm(List<Integer> arrayLenghts){
		List<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<arrayLenghts.size();i++){		/* calculating this algorithm for All N value */
			executionTime.exeTimeRadixSort(array, arrayLenghts.get(i));
		}
	}
	
	public static void shakerSortAlgorithm(List<Integer> arrayLenghts){
		List<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<arrayLenghts.size();i++){		/* calculating this algorithm for All N value */
			executionTime.exeTimeShakerSort(array, arrayLenghts.get(i));
		}
	}
	
	public static void maximumSubarrayAlgorithm(List<Integer> arrayLenghts){
		List<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<arrayLenghts.size();i++){		/* calculating this algorithm for All N value */
			executionTime.exeTimeMaximumSubarray(array, arrayLenghts.get(i));
		}
	}
}
