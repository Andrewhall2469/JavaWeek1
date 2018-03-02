import java.util.ArrayList;
import java.util.Scanner;



public class Person {
	String name;
	int age;
	String jobTitle;
	
	public Person(String name, int age, String jobTitle){
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	

public static void main(String args[]){

peopleTasks();

		
		
}	

public String toString() {
	return name + " " + age + " " + jobTitle;
}


public static void peopleTasks() {
	Person p1 = new Person("Andy", 23, "QAC");
	Person p2 = new Person("Shaun", 22, "QAC");
	Person p3 = new Person("John", 23, "QAC");
	Person p4 = new Person("Bill", 22, "QAC");
	Person p5 = new Person("Jerry", 23, "QAC");
	Person p6 = new Person("Gareth", 22, "QAC");
	Person p7 = new Person("Chris", 23, "QAC");
	Person p8 = new Person("Matt", 22, "QAC");
	ArrayList<Person> peopleArray = new ArrayList<Person>();
	peopleArray.add(p1);
	peopleArray.add(p2);
	peopleArray.add(p3);
	peopleArray.add(p4);
	peopleArray.add(p5);
	peopleArray.add(p6);
	peopleArray.add(p7);
	peopleArray.add(p8);
	
	StringBuilder sb = new StringBuilder();
	for (Person p: peopleArray) {
		sb.append(p);
	    sb.append("\n");

	}
	System.out.println(sb.toString());
	
	System.out.println("Enter name to be searched");
	Scanner scan = new Scanner(System.in);
	String input = scan.next();
	nameSearch(peopleArray, input);
	
	
	
}
public static void nameSearch(ArrayList peopleArray, String name) {
	

	for (Object people : peopleArray) {
		if(people.toString().contains(name)) {
			System.out.print(people);
		}
	}
	
	}
}