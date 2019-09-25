package com.InterviewPrep;

public class MaxNoFromArray 
{
	public int maxNo(int arr[])
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	public int minNo(int arr[])
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max>arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		MaxNoFromArray m=new MaxNoFromArray();
		int arr[]={1,2,9,8,4,-4,3,5};
		System.out.println("Max No is = "+m.maxNo(arr));
		System.out.println("Min no is = "+m.minNo(arr));
	}
}
