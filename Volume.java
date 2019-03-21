import javax.swing.JOptionPane;

public class Volume {
	
	String s;
	
	//calculate volume of a cube.
	public void getVolume(int l) {
		double cube = Math.pow(l,3);
		JOptionPane.showMessageDialog(null, "The volume of the cube is "+cube);
		
	}
	
	//calculate volume of a cylinder.
	public void getVolume (int r,int h) {
		double cylinder = Math.pow(r,2)*h;
		JOptionPane.showMessageDialog(null, "The volume of the cylinder is "+cylinder);
	}
	
	//calculate volume of a cuboid.
	public void getVolume (int l,int b,int w) {
		double cuboid =l*w*b;
		JOptionPane.showMessageDialog(null, "The volume of the cuboid is "+cuboid);
	}

	public static void main(String[] args) {
		Volume volume = new Volume();
		volume.getVolume(9);
		volume.getVolume(8, 4);
		volume.getVolume(5, 7, 3);
		
		
	}

}
