package week3.day2.CollectionAssignment;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNo {
//print only duplicate values
	public static void main(String[] args) {
		
		int[] data= {4,3,6,8,29,1,2,4,7,8};

		//using Set
		Set<Integer> dup=new HashSet<Integer>();
		Set<Integer> count=new HashSet<Integer>();
		for (int i=0;i<data.length;i++) {
			
			boolean add = dup.add(data[i]);
			if(!add) {
				
				count.add(data[i]);
			
		}
		
		}
		System.out.println("without duplicates: " +count);
		
		
	}


}
