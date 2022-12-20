package assignment4;

import java.util.ArrayList;

public class Task4 {

	public static void main(String[] args) {

		 ArrayList<Integer> list = new ArrayList<Integer>(8);
		 
		    list.add(10);
	        list.add(45);
	        list.add(90);
	        list.add(45);
	        list.add(23);
	        list.add(90);
	        list.add(44);
	        
	        int second = list.get(1);
	        
	        int secondlast = list.get(list.size() - 2);
	        
	        System.out.println("Second : " + second + ",  Second Last : " + secondlast);
	}

}
