import java.util.*;
public class Die {
	
	
	
	private int numberOfSides;
	private int rollNum = 0;
	
	public Die(int numSides){
		
		numberOfSides = numSides;
		
	}
	
	public void roll(){
		
		rollNum = (int) Math.ceil(Math.random() * numberOfSides);
		
	}
	
	public int getValue(){	
		return rollNum;
	}
	
}

