import java.util.Scanner;

public class Spiral {
	public static void main(String[] args) {
	
		System.out.println("Enter a value for spiral");
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		int [][] spiralGrid = new int[userInput][userInput];
		
		int i = 1;
		int leftCol = 0;
		int rightCol = userInput-1;
		int topRow = 0;
		int bottomRow = userInput-1;
		
		while (i <= userInput*userInput) {
			for (int a = leftCol; a <= rightCol; a++) {
				spiralGrid[topRow][a] = i;
				i++;
			}
			for (int a = topRow+1; a <= bottomRow; a++) {
				spiralGrid[a][rightCol] = i;
				i++;
			}
			for (int a = rightCol-1; a >= leftCol; a--) {
				spiralGrid[bottomRow][a] = i;
				i++;
			}
			for (int a = bottomRow-1; a >= topRow+1; a--) {
				spiralGrid[a][leftCol] = i;
				i++;
			}
			leftCol++;
			topRow++;
			rightCol--;
			bottomRow--;
			
		}
		
		for (int a = 0; a < spiralGrid.length; a++)
        {
            for (int j = 0; j < spiralGrid.length; j++)
            {
                System.out.print(spiralGrid[a][j] + "\t");
            }
             
            System.out.println();
        }
		
	}
}
