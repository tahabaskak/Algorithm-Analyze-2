import java.util.Collections;
import java.util.List;

public class stoogeSort {
	
	public static List<Integer> stoogeSorting(List<Integer> array,int i,int j){
		if(array.get(j) < array.get(i)){
			Collections.swap(array, i, j);			/* swap array element */
		}
		if( (j-i) > 1 ){
			int t = (( j -i +1 )/3);
			stoogeSorting(array, i, j-t);			/* again call stoogeSorting function */
			stoogeSorting(array, i+t, j);			/* again call stoogeSorting function */
			stoogeSorting(array, i, j-t);			/* again call stoogeSorting function */
		}
		return array;
	}
	
}