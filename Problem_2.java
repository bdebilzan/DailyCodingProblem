package daily_coding_problem;

import java.util.Arrays;

//[Hard]
//
//This problem was asked by Uber.
//
//Given an array of integers, return a new array such that each element at index i of the new array is the product of 
//all the numbers in the original array except the one at i.
//
//For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
//If our input was [3, 2, 1], the expected output would be [2, 3, 6].
//
//Follow-up: what if you can't use division?

public class Problem_2 {
	
	public static void main(String[] args) 
	{
		int [] array1 = {1, 2, 3, 4, 5};
		int [] result1 = new int [array1.length];
		
		result1 = products(array1, result1);
	
		System.out.println(Arrays.toString(result1));
		
		int [] array2 = {3, 2, 1};
		int [] result2 = new int [array2.length];
		
		result2 = products(array2, result2);
		
		System.out.println(Arrays.toString(result2));
	}
	
	private static int [] products(int [] array1, int [] result)
	{
		int product = 1;
		
		for(int i = 0; i < array1.length; i++)
		{
			for(int j = 0; j < array1.length; j++)
			{
				if(i != j)
				{
					product = array1[j] * product; 
				}			
			}
			
			result[i] = product;
			product = 1;
		}
		
		return result;
	}
}
