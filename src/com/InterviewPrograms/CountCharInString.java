package com.InterviewPrograms;

import java.util.HashMap;

public class CountCharInString 
{
	public static void main(String[] args) 
	{
		String str="I love my country my";
		String ch[]=str.split(" ");
		HashMap m=new HashMap();
		for(int i=0;i<ch.length;i++)
		{
			m.put(i, ch[i]);
		}
		System.out.println(m);
	}
}
