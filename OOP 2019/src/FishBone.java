//int max = if(num1>num2?num1:num2);
//if(condition?True:false);


import java.util.Scanner;

public class FishBone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num = sc.nextInt();
		
		if(num%5==0&&num%3==0) {
			//fish bone
			System.out.println("FishBone");
		}else if(num%3==0) {
			//fish
			System.out.println("Fish");
		}else if(num%5==0) {
			//bone
			System.out.println("Bone");
		}

	}

}
