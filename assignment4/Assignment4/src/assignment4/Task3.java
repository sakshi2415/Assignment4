package assignment4;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task3 {

	public static void main(String[] args) {

		 List<String> dup = new ArrayList<String>();  
	        dup.add("Java");  
	        dup.add("TestNG");  
	        dup.add("Maven");  
	        dup.add("Java");  
	        System.out.println(dup);
	        
	        Set<String> s = new LinkedHashSet<String>(dup);  
	        System.out.println(s);  
	}

}
