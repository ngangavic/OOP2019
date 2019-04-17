package inheritance;

public class Student extends Person{
	//attributes
	private int regNo;

	public Student() {
		super();
		this.regNo=0;
	}

	public Student(int regNo,String name, int age, Gender gender) {
		super(name, age, gender);
		this.regNo =regNo;
	}

	@Override
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Registration number: "+getRegNo());
	}
	
	//getter
	public int getRegNo() {
		return regNo;
	}	
	
	
	

	
	
	
	
	

}
