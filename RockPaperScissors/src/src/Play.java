package src;

import java.util.Scanner;

public class Play {
	Statistics s = new Statistics();

	Scanner scanner = new Scanner(System.in);

	
	
	
	public boolean startGame() {
		System.out.println("Welcome to the Rock, Paper, Scissors game \n" + "Press P to play or Q to quit!!!");
		String startInput = scanner.nextLine();
		if (startInput.equalsIgnoreCase("P")) {
			return true;
		} else if (startInput.equalsIgnoreCase("Q")) {
			return false;
		} else {
			System.out.println("You did not choose a valid option, please pick again");
			startGame();
		}
		return true;

	}
	
	public String computerPick() {
		double choice = Math.ceil(Math.random() * 3);
		double newChoice = (double)choice;
		String answer = "";
		if (newChoice == 1) {
			answer = "Rock";
		}
		else if (newChoice == 2) {
			answer = "Paper";
		}
		else
			answer = "Scissors";
		return answer;
	}

	public void playGame() {

		double[] winArray = { 0, 0, 0, 0 }; // Each position counts the total games for computer, human and ties
											// respectively
		double[] moveCount = { 0, 0, 0 }; // Each position in array counts how often rock, paper, scissors is chosen
										// respectively
		double[] pickCounter = null;
		while (startGame() == true) {
			winArray[0] += 1;
			System.out.println("It's your turn! Choose Rock, Paper or Scissors");
			String playInput = scanner.nextLine();
			pickCounter = s.pickCounter(playInput, moveCount);
			String compPick = computerPick();
			if (playInput.equalsIgnoreCase(compPick)) {
				System.out.println("Computer picked " + compPick + " It's a draw!");
				winArray[3] += 1;
			} else if (playInput.equalsIgnoreCase("Rock") && compPick.equalsIgnoreCase("Paper")) {
				System.out.println("You lose, computer picked " + compPick + " Try again");
				winArray[1] += 1;
			} else if (playInput.equalsIgnoreCase("Rock") && compPick.equalsIgnoreCase("Scissors")) {
				System.out.println("You win! Computer picked " + compPick + " Well played!");
				winArray[2] += 1;
			} else if (playInput.equalsIgnoreCase("Paper") && compPick.equalsIgnoreCase("Rock")) {
				System.out.println("You win! Computer picked " + compPick + " Well played!");
				winArray[1] += 1;
			} else if (playInput.equalsIgnoreCase("Scissors") && compPick.equalsIgnoreCase("Rock")) {
				System.out.println("You lose, computer picked " + compPick + " Try again");
				winArray[1] += 1;
			} else if (playInput.equalsIgnoreCase("Scissors") && compPick.equalsIgnoreCase("Paper")) {
				System.out.println("You win! Computer picked " + compPick + " Well played!");
				winArray[1] += 1;
			} else if (playInput.equalsIgnoreCase("Paper") && compPick.equalsIgnoreCase("Scissors")) {
				System.out.println("You lose, computer picked " + compPick + " Try again");
				winArray[1] += 1;
			}
		}
		System.out.println("" + winArray[2]);
		s.printStats(winArray);
		System.out.println(s.mostCommonChoice(pickCounter));

	}
}
