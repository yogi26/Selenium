package com.InterviewPrep;

import java.util.HashMap;

public class NoOfOccurences 
{
	

	public static void main(String[] args) 
	{
		String str="aabbcccaaahh";
		HashMap <Character,Integer> m =new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(m.containsKey(str.charAt(i)))
			{
				m.put(str.charAt(i), m.get(str.charAt(i))+1);
			}
			else
			{
				m.put(str.charAt(i), 1);
			}
		}
		System.out.println(m);
	}
}
