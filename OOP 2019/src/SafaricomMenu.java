import javax.swing.JOptionPane;

public class SafaricomMenu {

	public static void main(String[] args) {
		String s;
		int selection;

		s = JOptionPane.showInputDialog(
				"1.All In One Monthly Bundle \n " + "2.Daily Bundle \n " + "3.7Day Bundle \n" + "4.30Day Bundle \n"
						+ "5.Giga Bundle \n" + "6.Platinum \n" + "2aa7.Tunukiwa \n" + "8.Okoa Data \n" + "9.Balance \n");
		selection = Integer.parseInt(s);
		switch (selection) {
		case 1:
			JOptionPane.showMessageDialog(null, "You have selected:- \nAll In oNe Monthly Bundle.");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "You have selected:- \nDaily Bundle. ");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "You have selected:- \n7Day Bundle. ");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "You have selected:- \n30Day Bundle. ");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "You have selected:- \nGiga Bundle. ");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "You have selected:- \nPLatinum. ");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "You have selected:- \nTunukiwa. ");
			break;
		case 8:
			JOptionPane.showMessageDialog(null, "You have selected:- \nOkoa Data. ");
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "You have selected:- \nBalance. ");
			break;
		default:
			JOptionPane.showMessageDialog(null, "You have not selected anything");
			break;

		}

	}

}
