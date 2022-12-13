package week3.day2.CollectionAssignment;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {


		String s="PayPal India";
        char[] charArray = s.toCharArray();
		Set<Character> charSet=new HashSet<Character>();
		Set<Character> dupcharSet=new HashSet<Character>();
		
		for(int i=0;i<charArray.length;i++) {
			  boolean add = charSet.add(charArray[i]);
			  if(!add) {
				  dupcharSet.add(charArray[i]);
			      
		}

	}
		System.out.println(charSet);
    	System.out.println(dupcharSet);
    //	int frequency = Collections.frequency(charSet, 'a');
      //  System.out.println(frequency);
	

		
	}
}

