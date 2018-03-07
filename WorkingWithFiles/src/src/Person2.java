package src;

import java.util.ArrayList;

public class Person2 {
	ArrayList<Person2> peopleArray = new ArrayList<Person2>();
		String name;
		String occupation;
		int age;
		
		
public Person2(String name, String occupation, int age){
			super();
			this.name = name;
			this.occupation = occupation;
			this.age = age;
			
}


public String toString() {
	return name + " " + occupation + " " + age;
}

public void addPerson(Person2 p) {
	peopleArray.add(p);
}

	
}
