import java.util.Random;

public class random {

	public static int randomNumber(){
		Random rand = new Random();
		int randomNumber = rand.nextInt();		/* create random number */
		return randomNumber;
	}
	
	public static int randomNumberRange(){
		Random rand = new Random();
		int randomNumber = rand.nextInt(5000);	/* create random number range 0 to 5000 */
		return randomNumber;
	}
}