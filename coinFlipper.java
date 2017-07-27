import java.util.Random;

public class coinFlipper {

	public static void main(String[] args) {
		Random coin = new Random();
		int randomArray[] = new int[1000];  // length of the array i.e how many
											// times a coin is tossed.
		int countArray[] = new int[2];  // the amount of variables or counts in
										// the array i.e the number of sides on
										// a coin or dice.

		for (int i = 0; i < 1000; ++i) {    // i<100 means the array length is 100
											// and should match the randomArray
											// length.
			// i=1 is basically giving an even probability of getting a 1 or 0.
			randomArray[i] = coin.nextInt(2); // must be equal to the countArray integer.
												

		}

		for (int r : randomArray)
			countArray[r]++;

		// to access the counts.
		for (int x = 0; x < countArray.length - 1; x++) {

			System.out.println("" + "Tails occurs " + countArray[x] + " times");
		}
		for (int y = 1; y < countArray.length; y++) {

			System.out.println("Heads occurs " + countArray[y] + " times");
		}

		// above I declared x as the integer 0 and y as 1 in an array with two
		// variables either 0 or 1.
		// then in x I've asked it to take the length of the integer countArray
		// ( 0-1 for a total of 2) and subtract 1 so the loop only spits out the
		// first variable in the loop (0).
		// in y the same thing happened as in x except that y is declared as 1
		// by setting y equal to one and not subtracting anything from the
		// length the previously declared array.
		//
	}

}
