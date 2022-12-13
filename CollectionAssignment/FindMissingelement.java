package week3.day2.CollectionAssignment;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindMissingelement {

	public static void main(String[] args) {
	
		int[] data= {2,4,3,6,7};
		Set<Integer> m=new HashSet<Integer>();
		
		for (Integer i: data) {
		       m.add(i);
		}
		
		System.out.println(m);
		
		List<Integer> c=new ArrayList<Integer>(m);
		List<Integer> ms=new ArrayList<Integer>();
		for(int i=2;i<=c.size();i++) {
		  
			    
			 if(i!=c.get(i-2))
				{
			    	
			    	ms.add(i);
			        
			    	
			    }
			  
	}
		
		System.out.println("Missing elemennt is: " +ms);
}
	}


		       

	