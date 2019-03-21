
public class Dog {
	// instance variables(Data)
	/*public String name;
	public String breed;
	public int age;*/
	private String name;
	private String breed;
	private int age;
	
	//constructor
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public Dog(){
		this.name="Bweka";
		this.breed="usiku";
		this.age=8;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// methods(Behaviors)
	public int getHumanYears() {
		int humanYears = 0;
		if (age < 2) {
			humanYears = age * 11;
		} else {
			humanYears = 22 + ((age = 2) * 5);
		}
		return humanYears;
	}

	public void writeOutput() {
		System.out.println("Name: " + name);
		System.out.println("Breed: " + breed);
		System.out.println("Age: " + age);
		System.out.println("Age in human years: " + getHumanYears());
	}
}