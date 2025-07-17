import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		// Scanner
		Scanner scanner = new Scanner(System.in);

		boolean playAgain = false;

		do {
			// Random number generator 1-100
			int answer = (int) (Math.random() * (100 - 1)) + 1;

			int count = 0;

			System.out.println("Choose a number between 1 and 100: (Select 0 to quit)");
			int guess = scanner.nextInt();

			while (guess != 0) {
				if (guess > answer) {
					System.out.println("Too High! Guess again: ");
					guess = scanner.nextInt();
					count++;
				} else if (guess < answer) {
					System.out.println("Too Low! Guess again: ");
					guess = scanner.nextInt();
					count++;
				} else if (guess == answer) {
					count++;
					System.out.println("Correct! You got it in " + count + " guesses");
					break;
				}
			}

			System.out.println("Would you like to play again? (y or n):");
			String again = scanner.next();

			if (again.equals("y")) {
				playAgain = true;
			} else {
				playAgain = false;
			}

		} while (playAgain == true);
		
		System.out.println("Thanks for playing! Goodbye.");

		scanner.close();
	}

}
