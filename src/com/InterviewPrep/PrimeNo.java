package com.InterviewPrep;

public class PrimeNo 
{
	public static void main(String[] args) 
	{
		int n=7;
		boolean flag=false;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("not Prime");
		}
		else
		{
			System.out.println("prime");
		}
			
				
	}
}
