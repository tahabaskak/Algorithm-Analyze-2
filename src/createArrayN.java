import java.util.ArrayList;
import java.util.List;

public class createArrayN {
	
	public static ArrayList<Integer> createArray (List<Integer> array,int n){
		for(int i=0 ; i<n ; i++ ){		/* random number and add array for all element of array */
			int number = random.randomNumber();
			array.add(number);
		}
		return (ArrayList<Integer>) array;
	}
	
	public static ArrayList<Integer> createArrayRandomNumberRange (List<Integer> array,int n){
		for(int i=0 ; i<n ; i++ ){		/* random number and add array for all element of array */
			int number = random.randomNumberRange();
			array.add(number);
		}
		return (ArrayList<Integer>) array;
	}
	
	public static ArrayList<Integer> createArrayDeafult (List<Integer> arrayLenghts){
		/* create array for N elements (100-300-500-...-2500) */
		arrayLenghts.add(100);
		arrayLenghts.add(300);
		arrayLenghts.add(500);
		arrayLenghts.add(700);
		arrayLenghts.add(1100);
		arrayLenghts.add(1300);
		arrayLenghts.add(1500);
		arrayLenghts.add(1700);
		arrayLenghts.add(1900);
		arrayLenghts.add(2100);
		arrayLenghts.add(2300);
		arrayLenghts.add(2500);
		return (ArrayList<Integer>) arrayLenghts;
	}
}
