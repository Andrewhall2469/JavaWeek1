
public class Person2 {
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
}