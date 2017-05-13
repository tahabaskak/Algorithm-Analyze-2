import java.util.List;

public class maximumSubarray {
	
	public static int max(int a, int b) { 		/* compare two number */
		return (a > b)? a : b; 
	}
	 
	public static int max(int a, int b, int c) { 	/* compare three number */
		return max(max(a, b), c); 
	}
	
	public static int maxSubarray (List<Integer> array,int n){
		if(n==0)
			return 0;
		
		return maxSubArray(array,0,n-1);		/* return max sub array */
	}
	
	public static int maxSubArray(List<Integer> array,int low,int high){
		if(high == low)
			return array.get(low);		
		
		int middle = (low + high )/2;		/* calculate mid point */
		int leftans = maxSubArray(array,low,middle);	/* calculate array for left side */
		int rightans = maxSubArray(array,middle+1,high);	/* calculate array for right side */
		int leftMax = array.get(middle);	/* calculate left side max  */
		int rightMax = array.get(middle+1);	/* calculate right side max  */
		int temp =0;
		for( int i=middle ; i >low ; i--){
			temp = temp + array.get(i);
			if(temp > leftMax)			/* Find left max  */
				leftMax = temp;
		}
		temp =0;
		for(int i = middle+1 ; i<= high ;i++){
			temp = temp + array.get(i);
			if(temp > rightMax)			/* Find right max  */
				rightMax = temp;
		}
		return max(max(leftans,rightans),leftMax+rightMax);		/* return max sub array */
	}
	
}