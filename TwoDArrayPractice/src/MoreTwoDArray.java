import java.util.Arrays;

public class MoreTwoDArray {

public static void main(String args[] ) {
	
    // initializing two dimensional array as literal
    String[][] array = { 
    };
 // how to initialize two dimensional array in Java 
    // using for loop
    int[][] board = new int[9][9];
    for (int xAxis = 0; xAxis < board.length; xAxis++) { 
    	for (int yAxis = 0; yAxis < board[xAxis].length; yAxis++) { 

            board[xAxis][yAxis] = xAxis + yAxis;
    	 }
    }
    
 // now let's print a two dimensional array in Java 
    for (int[] a : board) {
        for (int i : a) {
            System.out.print(i + "\t");
        }
        System.out.println("\n");
    }
    // printing 2D array using Arrays.deepToString() method
//    System.out.println("another way to print 2D arrays");
//    System.out.println(Arrays.deepToString(board));

}
	
}
