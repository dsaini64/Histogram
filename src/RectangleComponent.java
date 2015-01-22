import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.HashMap;

import javax.swing.JComponent;


public class RectangleComponent extends JComponent{
	
	public HashMap<String, Integer> h;
	
	public RectangleComponent(HashMap<String,Integer> hashMap){
		
		h = hashMap;
		
	}

	public void paintComponent(Graphics g){
		
		
		Graphics2D g2 = (Graphics2D) g;
		Rectangle box = new Rectangle(5, 10, 20, 30);
		
		g2.draw(box);
	}

}
