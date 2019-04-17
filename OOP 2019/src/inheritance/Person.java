package inheritance;

public class Person {
	//attributes
	private String name;
	private int age;
	private Gender gender;
	
	//constructors
	public Person() {
		this.name="no name yet";
		this.age=0;
		this.gender=Gender.Unknown;
	}
	
	public Person(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//Behaviors
	public void writeOutput() {
		System.out.println("Name: "+getName());
		System.out.println("Age: "+getAge());
		System.out.println("Gender: "+getGender());
	}

	//getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	//setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	


}
