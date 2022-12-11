package week3.day1.ass1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text="We learn java basics as part of java sessions in java week1";
		String tex="";
		//string[0]="We"
		//string[1]="learn"
		//string[2]="java"
		String[] split= text.split(" ");     //split length = 12 cal
		
		for(int i=0;i<=split.length-1;i++) {  
			tex = tex+split[i]+" "; 
			 for(int j=i+1;j<split.length;j++) {
				if(split[i].equals(split[j]))
						{
					    split[j]="";
					
				}  
				
	
			}
		}System.out.println("string without duplicate word: " +tex);
	}
}
			
			
			
	
