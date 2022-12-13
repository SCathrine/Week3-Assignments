package week3.day2.CollectionAssignment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
//print only the unique character
	public static void main(String[] args) {
		
		String name= "catherine";
		char[] c= name.toCharArray();
        Set<Character> unique=new HashSet<Character>();
		Set<Character> dup=new HashSet<Character>();
	        for(int i=0;i<c.length;i++) {
	    
	           boolean add = unique.add(c[i]);
	           if(!add) {
	        	 
	        	  dup.add(c[i]);
	        	 
	         }
	    }
	     System.out.println("duplicate characters: " +dup);
	     
}
}


