import java.util.List;

public class findingSecondLargestElement {

	public static int findingSecondLargest(List<Integer> array,int n){
		int largestElement , secondLargestElement ;
		
		if(array.get(0) > array.get(1)){	/* firstly max end second max element at array first two element */
			largestElement = array.get(0);
			secondLargestElement = array.get(1);
		}
		else{
			largestElement = array.get(1);
			secondLargestElement = array.get(0);
		}
		
		for(int i=2 ; i < n ; i++){			/* loop n-2 time */
			if(array.get(i) <= largestElement && array.get(i) > secondLargestElement){
				secondLargestElement = array.get(i);	/* change second max element */
			}
			if(array.get(i) > largestElement){
				secondLargestElement = largestElement;	/* change second max element */
				largestElement = array.get(i);
			}
		}
		return secondLargestElement;		/* return second max element in array */
	}
	
}