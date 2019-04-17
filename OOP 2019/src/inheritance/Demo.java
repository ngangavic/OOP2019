package inheritance;

public class Demo {
	
	public static void main(String [] args) {
		Person p = new Person();
		Student s = new Student();
		//s.writeOutput();
		
		
		Person t = new Student();
		Person x = new Undergraduate();
		//Student w = new Person();
		t.writeOutput();
		
			
		/*Person t = new Student();
		t.writeOutput();*/
	
		/*System.out.println(p instanceof Person);
		System.out.println(s instanceof Person);
		System.out.println(p instanceof Student);
		System.out.println(s instanceof Student);*/
	}

}
