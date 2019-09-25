package com.InterviewPrep;

public class StringReverse
{
	public void method1(String str)
	{
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println("\n-------------");
	}
	public void method2(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}
	public static void main(String[] args) 
	{
		StringReverse s=new StringReverse();
		s.method1("Yogesh");
		s.method2("Rahul");
	}
}
