package src;
public class BattleshipsMain {

	public static void main(String[] args) {
//		System.out.println("Hello and welcome to BATTLESHIPS");
		PlayerOneBoard p1B = new PlayerOneBoard();
		PlayerTwoBoard p2B = new PlayerTwoBoard();
		createP1Board(p1B.p1Board);
		createP2Board(p2B.p2Board);
		showP1Board(p1B.p1Board);
		System.out.println("-------------------------------------");
		showP2Board(p2B.p2Board);

	}
	public static void createP1Board(int[][] board) {
		for (int xAxis = 0; xAxis < 3; xAxis++) {
			for (int yAxis = 0; yAxis < 3; yAxis++) {
				board[xAxis][yAxis]=-1;						//Setting all original positions on board to -1
			}		
		}
	}
	public static void createP2Board(int[][] board) {				
		for (int xAxis = 0; xAxis < 3; xAxis++) {
			for (int yAxis = 0; yAxis < 3; yAxis++) {
				board[xAxis][yAxis]=-1;						//Setting all original positions on board to -1
			}
		}
	}
	public static void showP1Board(int[][] board){
		System.out.println("\t Player One Board \n");
        System.out.println("\t1 \t2 \t3");	//Label the xAxis label the yAxis with tab for readability
        
        for(int xAxis = 0; xAxis < 3; xAxis++){
            System.out.print((xAxis+1) + "");					//Label the xAxis 1-10
            for(int yAxis = 0 ; yAxis < 3 ; yAxis++){
                if(board[xAxis][yAxis] == -1){
                    System.out.print("\t" + "-");			//print the positions with "-" if xAxis pos and yAxis pos are -1
                }
                else if(board[xAxis][yAxis] == 0){
                    System.out.print("\t"+ "#");			//print the positions with "#" if xAxis pos and yAxis pos are 0
                }
                else if(board[xAxis][yAxis] == 1){
                    System.out.print("\t" + "X");			//print the positions with "X" if xAxis pos and yAxis pos are 1
                }
            }
            System.out.println();
        }

    }
	public static void showP2Board(int[][] board){
		System.out.println("\t Player Two Board \n");
        System.out.println("\t1 \t2 \t3");	//Label the xAxis label the yAxis with tab for readability
        
        for(int xAxis = 0; xAxis < 3; xAxis++){
            System.out.print((xAxis+1) + "");					//Label the xAxis 1-10
            for(int yAxis = 0 ; yAxis < 3 ; yAxis++){
                if(board[xAxis][yAxis] == -1){
                    System.out.print("\t" + "-");			//print the positions with "-" if xAxis pos and yAxis pos are -1
                }
                else if(board[xAxis][yAxis] == 0){
                    System.out.print("\t"+ "#");			//print the positions with "#" if xAxis pos and yAxis pos are 0
                }
                else if(board[xAxis][yAxis] == 1){
                    System.out.print("\t" + "X");			//print the positions with "X" if xAxis pos and yAxis pos are 1
                }
            }
            System.out.println();
        }

    }
	
	
	
}
