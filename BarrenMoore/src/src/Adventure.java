package src;
import java.util.Scanner;

public class Adventure {
	public static double pythagoras (Player p, Treasure t) {
		int a;
		int b;
		if (p.x > t.x) 
		{
			a = (p.x*p.x) - (t.x*t.x);
		}
		else 
		{
			a = (t.x*t.x) - (p.x*p.x);
		}
		if (p.y > t.y) 
		{
			b = (p.y*p.y) - (t.y*t.y);
		}
		else 
		{
			b = (t.y*t.y) - (p.y*p.y);
		}
		return Math.sqrt(a+b);
	}
	public static void main(String[] args) {
		Grid g = new Grid();
		Treasure t = new Treasure();
		Player p = new Player();
		p.setX(4);
		p.setY(4);
		t.setX(7);
		t.setY(7);
		g.twoD[p.x][p.y] = 9;
		g.twoD[t.x][t.y] = 1;
//		outputGrid(g.twoD);
		String input = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello and welcome to the worst game of your life! Press <ENTER> to continue");
		System.out.println("You wake up find yourself stranded in the middle of the ocean\n"
				+ "There is no sign of life for miles\n" + "Luckily your Michael Phelps on steroids\n"
				+ "You notice attached to your wrist is a small watch-like device\n"
				+ "But it only seems to read numbers\n"
				+ "------------------------------------------------------------------------\n");
		System.out.println("Type 'look' to look");
		input = scanner.nextLine();
//		if (input.equals("Look") || input.equals("Look")) {
//			
//		}
//		System.out.println("You are " + pythagoras(p, t) + " miles away");
		int check = 0;
		try {
		while(check == 0) 
		{
			System.out.println("Enter north(n), south(s), east(e) or west(w) to move");
			input = scanner.nextLine();
			
			System.out.println("You are " + pythagoras(p, t) + " miles away");
		if (input.equals("n") || input.equals("N")) 
		{
			p.x--;
			g.twoD[p.x][p.y] = 9;
			g.twoD[p.x+1][p.y] = 0;
//					outputGrid(g.twoD);
		}
		else if (input.equals("s") || input.equals("S")) 
		{
			p.x++;
			g.twoD[p.x][p.y] = 9;
			g.twoD[p.x-1][p.y] = 0;
//			
//				 outputGrid(g.twoD);			
		}
		else if (input.equals("e") || input.equals("E")) 
		{
			p.y++;
			g.twoD[p.x][p.y] = 9;
			g.twoD[p.x][p.y-1] = 0;
//			
//				 outputGrid(g.twoD);			
		}
		else if (input.equals("w") || input.equals("W")) 
		{
			p.y--;
			g.twoD[p.x][p.y] = 9;
			g.twoD[p.x][p.y+1] = 0;
//			
//				 outputGrid(g.twoD);			
		}
		if ((p.x == t.x) && (p.y == t.y)) 
		{
			check = 1;
			System.out.println("Congratulations, you're a regular olympian");
		}
		}	

	} catch (Exception e) {
		System.out.println("YOU GOT EATEN BY A SHARK ON STEROIDS");
	}
	}
//	public static void outputGrid(int[][] grid) {
//		for (int i = 0; i < 9; i++) {
//			for (int j = 0; j < 9; j++) {
//				System.out.print(grid[i][j] + " ");
//			}
//			System.out.println();
	//	}
//	}

}
