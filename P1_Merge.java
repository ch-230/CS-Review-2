import java.util.Arrays;

/**
 * Merging 2 arrays together is a very useful operation!
 * In this problem, we merge 2 sorted arrays to create a sorted array
 * This does not require any sorting!
 * 
 * On a high level, here is the solution:
 * For each element in the result (starting from the first element),
 * pick the smallest element remaining and remove this element from its array
 * 
 * Note that because the arrays are sorted, the smallest element will 
 * be either the first element of either the first or second array, always
 * 
 */

public class P1_Merge {

	static final int NUM_TCASES = 10;

	/**
	 * Given 2 sorted arrays, merge them into another sorted array
	 * This is done in the following fashion:
	 * Find the smallest unused element remaining from the arrays
	 * Take it out and put it in the next index in the returned array
	 * Note that the smallest element will be the first element of one array
	 * as they are both sorted
	 * 
	 * @param a: The first array, which is sorted
	 * @param b: The second array, which is sorted
	 * @return The merged array, which should be sorted
	 */
	public static int[] Merge(int[] a, int[] b) {
		int[] merged = new int[a.length + b.length];
		// your code starts here

		// your code ends here
		return merged;
	}
	
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

	/**
	 * Checks your solution for correctness, 
	 */
	public static void check() {
		for (int i = 0; i < NUM_TCASES; i++) {
			System.out.printf("--------%nTEST CASE %d%n", i + 1);
			int[] first = genRandom(10);
			int[] second = genRandom(10);

			int[] ground = new int[20];
			System.arraycopy(first, 0, ground, 0, 10);
			System.arraycopy(second, 0, ground, 10, 10);
			Arrays.sort(ground);

			int[] candidate = Merge(first, second);
			if (Arrays.equals(ground, candidate)) {
				System.out.println("PASSED");
			} else {
				System.out.println("FAILED");
				System.out.printf("FIRST: %s%n", Arrays.toString(first));
				System.out.printf("SECOND: %s%n", Arrays.toString(second));
				System.out.printf("YOURS: %s%n", Arrays.toString(candidate));
				System.out.printf("CORRECT: %s%n", Arrays.toString(ground));
				return;
			}

		}
		System.out.println("--------\nALL TESTS PASSED");
	}

	public static void main(String[] args) {

		check();

	}

}
