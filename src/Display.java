import javax.swing.JFrame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.*;


public class Display extends JFrame {
	
    static final int ITEMS = 24;
    static final int CAPACITY = (int) (Math.ceil(ITEMS*1.3));
    static HashMap<String,Integer> h = new HashMap<String,Integer>(CAPACITY);
	static int sumOfRolls = 0;
   
    
    
	
    public static void initHashMap() {
    	 Die d = new Die(6);
    	 
        String keyInt;
        
        for (int i = 0; i < 1000; i++) {
        	sumOfRolls = 0;
        	for(int j = 0; j < 4; j++){
	    		d.roll();
	    		sumOfRolls += d.getValue();
    		 }
        	
            keyInt = "" + sumOfRolls;
            if (h.get(keyInt) == null) {
                h.put((keyInt + ""), 1);
            } else {
                h.put((keyInt + ""), (Integer) (h.get(keyInt)) + 1);
            }
        }
        
        RectangleComponent r = new RectangleComponent(h);
    }
    
    public static void printHashMap() {
        Set keySet = h.keySet();   // returns all keys in the HashMap
        Iterator iter = keySet.iterator();
        
        while (iter.hasNext()) {
            Object key = iter.next();
            Object value = h.get(key);
            System.out.println(key + ": " +
                    ", hashcode = " + key.hashCode() + 
                    ", occurrences = " + value);
        }
        
        System.out.println(h.keySet());
        System.out.println(h.values());
    }
    
    

    
    
    
    
    
  
}