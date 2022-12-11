package week3.day1.ass1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	
		String text1="stops";
        String text2="pottss";
        if(text1.length()==text2.length()) {
        	char[] c= text1.toCharArray();
        	char[] c1=text2.toCharArray();	
        	int count=0;
        	Arrays.sort(c);
        	Arrays.sort(c1);
        	System.out.println(c);
        	System.out.println(c1);
                	for(int i=0;i<text1.length();i++) {
                     if(c[i]==c1[i]) {	
                	}
                	else {
                		
                		count++;
                          }
            }
                	if(count>0) {
                		
                		System.out.println("not anagram");
                	}
                	else {
                		System.out.println("Anagram");
                	}
        	
        	
        }
        else {
        
        	System.out.println("Not anagram");
              }
        }
        
	}


