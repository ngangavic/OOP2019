package inheritance;

public class Undergraduate extends Student {
	private int level;

	public Undergraduate() {
		super();
		this.level = 0;
	}

	public Undergraduate(int level,int regNo, String name, int age, Gender gender) {
		super(regNo, name, age, gender);
		this.level = level;
	}

	@Override
	public void writeOutput() {
		// TODO Auto-generated method stub
		super.writeOutput();
		System.out.println("Level:" + level);
	}

}
