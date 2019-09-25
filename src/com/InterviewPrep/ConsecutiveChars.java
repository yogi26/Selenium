package com.InterviewPrep;

public class ConsecutiveChars 
{
	public static void main(String[] args) 
	{
		String str="abaaabcaaahhhhddddaaaa";
		int c=1;
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)==str.charAt(i++))
			{
				c++;
			}
			else
			{
				System.out.println(str.charAt(i-1)+" "+c);
				c=0;
			}
		}
		
	}
}
