package ArrayShuffler;

import java.util.Random;

public class ArrayShuffler {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);

        System.out.print("Shuffled Array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    private static void shuffleArray(int[] array) {
        Random rand = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int randomIndex = rand.nextInt(i + 1);

            // Swap array[i] with array[randomIndex]
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }

	}

}
