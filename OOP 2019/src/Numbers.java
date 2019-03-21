import javax.swing.JOptionPane;
public class Numbers {

	public static void main(String[] args) {
		int a,b,sum;
		String s;
		
		s = JOptionPane.showInputDialog("Enter first number");
		a = Integer.parseInt(s);
		
		s = JOptionPane.showInputDialog("Enter second number");
		b = Integer.parseInt(s);
		
		sum = a+b;
		
		JOptionPane.showMessageDialog(null,"The sum is "+ sum);
		
		

	}

}
