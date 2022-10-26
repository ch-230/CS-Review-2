import java.util.Arrays;
import java.util.Collections;

public class P3_Reverse_Insertion {
	
	static final int NUM_TCASES = 10;
	
	/**
	 * An array of random integers from 0 to 99
	 * @param length: the length of the randomized array
	 * @return
	 */
	private static int[] genRandom(int length) {
		int[] ret = new int[length];
		for (int i = 0; i < length; i++) {
			ret[i] = (int) (Math.random() * 100.0);
		}
		return ret;
	}
	
	public static void check() {
		
		for(int i = 0; i < NUM_TCASES; i++) {
			
			System.out.printf("--------%nTEST CASE %d%n", i + 1);
			
			int[] ref = genRandom(50);
			int[] ground = ref.clone();
			Arrays.sort(ground);
			Collections.reverse(Arrays.asList(ground));
			
			int[] candidate = reverseInsertion(ref);
			
			if (Arrays.equals(ground, candidate)) {
				System.out.println("PASSED");
			} else {
				System.out.println("FAILED");
				System.out.printf("ARRAY: %s%n", Arrays.toString(ref));
				System.out.printf("YOURS: %s%n", Arrays.toString(candidate));
				System.out.printf("CORRECT: %s%n", Arrays.toString(ground));
				return;
			}
		}
		
		System.out.println("--------\nALL TESTS PASSED");
		
	}
	
	public static int[] reverseInsertion(int[] arr) {
		//your code starts here
		
		//your code ends here
		return arr;
	}
	
	
	public static void main(String[] args) {
		check();
	}
}
