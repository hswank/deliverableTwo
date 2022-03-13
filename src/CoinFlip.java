import java.security.SecureRandom;
import java.util.Scanner;

public class CoinFlip {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecureRandom rand = new SecureRandom();
	
		System.out.print("Guess which will have more: heads or tails? ");
		String headsOrTailsGuess = input.next();
		System.out.print("How many times shall we flip a coin? ");
		int numberOfFlips = input.nextInt();
		int coinFlip = rand.nextInt(1);
		int heads = 0;
		int correctCount = 0;
		
		System.out.printf("%nResults of coin flipping:%n");
		for (int i = 0; i < numberOfFlips; i++) {
			if (coinFlip == heads) {
				System.out.println("heads");
				if (headsOrTailsGuess.equals("heads")) {
					correctCount++;
				}
			} else {
				System.out.println("tails");
				if (headsOrTailsGuess.equals("tails")) {
					correctCount++;
				}
			}
			
			coinFlip = rand.nextInt(2);
		}
		
		double correctPercentage = ((double)correctCount/(double)numberOfFlips) * 100;
		System.out.printf("%nYour guess, %s, came up %d time(s)%n", headsOrTailsGuess, correctCount);
		System.out.printf("That's %.0f%%.", correctPercentage);
		input.close();
	}
}
