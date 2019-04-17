
public class DogDemo {

	public static void main(String[] args) {
		
		Dog d = new Dog("Rex","German Shepherd",10);
		d.writeOutput();
		
		System.out.println("-------------------------------------------------------------------------");
		
		Dog r = new Dog();
		r.setName("Scoobu Doo");
		r.setBreed("Great Dane");
		r.setAge(50);
		System.out.print(r.getName() +" is a "+r.getBreed());
		System.out.print(". He is "+r.getAge() + " years old, or ");
		int humanAge = r.getHumanYears();
		System.out.println(humanAge  + " in human years.");
		
		
		
		/*Dog r = new Dog();
		r.name="Rex";
		r.breed="Bull dog";
		r.age=6;
		r.writeOutput();
		
		System.out.println("-------------------------------------------------------------------------");
		
		
		Dog s = new Dog();
		s.name="Blablabla";
		s.breed="German Shepherd";
		s.age=50;
		
		System.out.print(s.name +" is a "+s.breed);
		System.out.print(". He is "+s.age + " years old, or ");
		int humanAge = s.getHumanYears();
		System.out.println(humanAge  + " in human years.");*/
		
	    //s.writeOutput();	

	}

}
