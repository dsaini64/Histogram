import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		Display disp = new Display();
		disp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		disp.setSize(1000, 500);
		
		disp.setTitle("Histogram of Dice Rolls");
		disp.initHashMap();
		disp.printHashMap();
		
		RectangleComponent component = new RectangleComponent();
		disp.add(component);
		
		disp.setVisible(true);
		
		
		
		
	}
}