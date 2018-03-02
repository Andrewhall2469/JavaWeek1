
public class TwoDArray {
	int[][] myArray = {  {236, 189, 189,   0},
            			 {236,  80, 189, 189},
            			 {236,   0, 189,  80},
            			 {236, 189, 189,  80}  };
	
	public static void main(String[] args) {
		int cols = 10;
		int rows = 10;
		int[][] myArray = new int[cols][rows];

		// Two nested loops allow us to visit every spot in a 2D array.   
		// For every column I, visit every row J.
		for (int i = 0; i < cols; i++) {
		  for (int j = 0; j < rows; j++) {
		    myArray[i][j] = 0;
		    
		    System.out.println(myArray.deepoString());
		  }
		}
	}
}
