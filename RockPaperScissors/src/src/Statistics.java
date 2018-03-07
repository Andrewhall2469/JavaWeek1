package src;

public class Statistics {

	
	public void printStats(double[] winArray) {
		System.out.println("Your total games played is: " + winArray[0]); 
		System.out.println("Computer wins: " + winArray[1] + " Win percentage of computer was: " + winArray[1] / winArray[0] * 100 + "%");
		System.out.println("Your wins: " + winArray[2] + " Win percentage of computer was: " + winArray[2] / winArray[0] * 100 + "%");
		System.out.println("Number of draws: " + winArray[3] + " Win percentage of computer was: " + winArray[3] / winArray[0] * 100 + "%");
}
	public double[] pickCounter(String userChoice, double[] moveCount) {
		if (userChoice.equalsIgnoreCase("Rock")) {
			moveCount[0] += 1;
			return moveCount;
		}
		else if(userChoice.equalsIgnoreCase("Paper")) {
			moveCount[1] += 1;
			return moveCount;
		}
		else if(userChoice.equalsIgnoreCase("Scissors")) {
			moveCount[2] += 1;
			return moveCount;
		}
		return moveCount;
	}
	
	public double findMax(double[] listArray) {
		double answer = 0;
		for(double n : listArray) {
			if (n > answer) {
				answer = n;
			}
			else continue;
			
		}
		return answer;
	}
	
	public String mostCommonChoice(double[] pickCounter) {
		double totalPicks = pickCounter[0] + pickCounter[1] + pickCounter[2];
		
		if (findMax(pickCounter) == pickCounter[0]) {
			return "You chose Rock the most which was " + pickCounter[0] + " times" + " With a percentage of: " + pickCounter[0] / totalPicks * 100 + "%";
		}
		else if (findMax(pickCounter) == pickCounter[0]) {
			return "You chose Paper the most which was " + pickCounter[1] + " times" + " With a percentage of: " + pickCounter[1] / totalPicks * 100 + "%";
		}
		else if (findMax(pickCounter) == pickCounter[0]) {
			return "You chose Scissors the most which was " + pickCounter[2] + " times" + " With a percentage of: " + pickCounter[2] / totalPicks * 100 + "%";
		}
		return "";
	}
	
}
