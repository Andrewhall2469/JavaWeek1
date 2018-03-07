import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class FileRunner {
	
	private final static String FileRunner = "C:\\Users\\Admin\\Desktop\\FileRunner.txt";
	
public static void main(String[] args) throws IOException {
		
		Person2 p1 = new Person2("Andy", "QAC", 23);
		Person2 p2 = new Person2("Shaun", "QAC", 85);
		Person2 p3 = new Person2("John", "QAC", 66);
		Person2 p4 = new Person2("Bill", "QAC", 34);
		Person2 p5 = new Person2("Jerry", "QAC", 65);
		ArrayList<Person2> peopleArray = new ArrayList<Person2>();
		peopleArray.add(p1);
		peopleArray.add(p2);
		peopleArray.add(p3);
		peopleArray.add(p4);
		peopleArray.add(p5);
		
		StringBuilder sb = new StringBuilder();
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FileRunner))) {
			bw.write(peopleArray.toString());
			bw.newLine();
//			for (Person2 p: peopleArray) {
				
//				sb.append(p);
//			    sb.append("\n");

//			}
			
//			System.out.println(sb.toString());
			System.out.println("File Created");
			
		} catch (IOException e) {
			e.printStackTrace();
	} 

		
	}

}