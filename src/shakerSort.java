import java.util.Collections;
import java.util.List;

public class shakerSort {

	public static void shakerSorting(List<Integer> array, int n){
		for(int i=0 ; i<n/2 ; i++){		
			boolean swapped = false;
			for(int j=i ; j<n-i-1 ; j++){	
				if(array.get(j) < array.get(j+1)){
					Collections.swap(array, j+1, j);	/* swap array element */
					swapped = true;
				}
			}
			for(int j=n-2-i ; j>i; j--){
				if(array.get(j-1) < array.get(j)){
					Collections.swap(array, j, j-1);	/* swap array element */
					swapped = true;
				}
			}
			if(!swapped)	/* if not swap , break for loop */
				break;
		}
	}
	
}
