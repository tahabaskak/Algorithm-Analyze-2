import java.util.List;

public class radixSort {
	
	public static void radixSorting(List<Integer> array, int n){
		int i , max = array.get(0) , exp = 1 ;
		int[] b = new int[n];		/* create buffer array */
		for(i=1 ; i<n ; i++){
			if(array.get(i) > max){
				max = array.get(i);		/* find max element in array */
			}
		}
		while(( max/exp ) > 0){			/* max element divede 1-10-100-1000... */
			int[] bucket = new int[n];
			
			for(i=0 ; i<n ; i++)
				bucket[(array.get(i)/exp)%10]++;
			for(i=1 ; i<10 ; i++)
				bucket[i] += bucket[i -1];
			for(i=n-1 ; i>=0 ; i--)
				b[--bucket[(array.get(i)/exp)%10]] = array.get(i);
			for(i=0 ; i<n ; i++)
				array.set(i, b[i]);
			exp *= 10;
		}	
	}
	
}