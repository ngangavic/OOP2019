import java.util.Scanner;

public class Circle {
	static final double pi = Math.PI;
	public static void main(String[] args) {
		System.out.println("Enter radius of the circle:");
		Scanner scanner = new Scanner(System.in);
		int radius = scanner.nextInt();
		//System.out.println("The area of a circle with radius "+ radius+" "+getArea(radius));
		System.out.printf("The area of a circle with radius %d is %f",radius,getArea(radius));
		//getArea(7);
	}
	static double getArea(int r) {
		double area=pi*r*r;
		return area;
	}

}
