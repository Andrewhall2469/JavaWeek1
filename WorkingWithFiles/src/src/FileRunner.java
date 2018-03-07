package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileRunner {
	
	private final static String FileRunner = "C:\\Users\\Admin\\Desktop\\FileRunner.txt";
	private final static String FileReader = "C:\\Users\\Admin\\Desktop\\FileRunner.txt";
	
public static void main(String[] args) {
		Person2 pers = new Person2(null, null, 0);
		Person2 p1 = new Person2("Andy", "QAC", 23);
		Person2 p2 = new Person2("Shaun", "QAC", 85);
		Person2 p3 = new Person2("John", "QAC", 66);
		Person2 p4 = new Person2("Bill", "QAC", 34);
		Person2 p5 = new Person2("Jerry", "QAC", 65);
		pers.addPerson(p1);
		pers.addPerson(p2);
		pers.addPerson(p3);
		pers.addPerson(p4);
		pers.addPerson(p5);
//		StringBuilder sb = new StringBuilder();
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FileRunner))) {
			bw.write(pers.peopleArray.toString());
			bw.newLine();
//			for (Person2 p: pers.peopleArray) {
//				
//				sb.append(p);
//			    sb.append("\n");
//
//			}
			
//			System.out.println(sb.toString());
			System.out.println("Writing following data into file:");
			System.out.println(pers.peopleArray);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try  {
			BufferedReader br = new BufferedReader(new FileReader(FileReader));
			System.out.println("Retrieving following data from the file:");
			String line = "";
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println("Invalid input/output detected");
			e.printStackTrace();
		}
		
		
	}

}
