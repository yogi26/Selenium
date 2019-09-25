package com.naveenAutomantion;

public class DisplayNonRepeatCharFromString {

	public static void main(String[] args)
	{
		String name="udaykumar";
		boolean flag;
		for(int i=0;i<name.length();i++)
		{	
			flag=true;
			for(int j=0;j<name.length();j++)
			{
				if(i!=j)
				{
					if(name.charAt(i)==name.charAt(j))
					{
						flag=false;
					}
				}
			}
			if(flag)
				System.out.print(name.charAt(i)+" ");
		}

	}

}
