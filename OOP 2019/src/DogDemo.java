
public class DogDemo {

	public static void main(String[] args) {
		Dog s = new Dog();
		s.name="Blablabla";
		s.breed="German Shepherd";
		s.age=50;
		
		System.out.print(s.name +" is a "+s.breed);
		System.out.print(". He is "+s.age + " years old, or ");
		int humanAge = s.getHumanYears();
		System.out.println(humanAge  + " in human years.");
		
	    //s.writeOutput();	

	}

}
