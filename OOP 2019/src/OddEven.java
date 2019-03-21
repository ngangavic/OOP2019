import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scanner.nextInt();
		if(num%2==0) {
			System.out.println("The integer "+num+ " is Even");
		}else {
			System.out.println("The integer "+num+" is Odd");
		}

	}

}
