package week3.day2.CollectionAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecLargestNo {
//using set-TreeSet(ascii value/ordered set)
	public static void main(String[] args) {
		
		int[] a= {3,2,11,4,6,7,2,3,3,6,7};
        Set<Integer> values=new TreeSet<Integer>();
        //add array values to set
             for(int i=0;i<a.length;i++) {
            	 
            	 values.add(a[i]);
             }
               System.out.println(values);
             
             //convert Set to List to get()
             List<Integer> f=new ArrayList<Integer>(values);
            
            	    int size = f.size();
            	    	System.out.println("size of list : " +size); 
            	    	
            	     Integer integer = f.get(size-2);
            	    	System.out.println("Second Largest No: " +integer);
            		   
            		  
            	   }
             }
	


