package com.naveenAutomantion;

public class StringReplace 
{
	public static void main(String[] args)
	{
		String str="abc is my company";
		String arr[]=str.split(" ");
		String nm=null;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equalsIgnoreCase("company"))
			{
				nm=arr[i];
			}
		}
		System.out.println(nm);
		
		
	}
}
