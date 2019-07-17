package daily_coding_problem;

import java.util.Arrays;

//[Hard]
//
//This problem was asked by Stripe.
//Given an array of integers, find the first missing positive integer in linear time and constant space. 
//In other words, find the lowest positive integer that does not exist in the array. 
//The array can contain duplicates and negative numbers as well.
//For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
//You can modify the input array in-place.

//improve time complexity [Arrays.sort]

public class Problem_4 {
	
	public static void main(String[] args) 
	{
		int [] array1 = {3, 4, -1, 1};
		int result1 = lowestPositive(array1);
		
		System.out.println(result1);
		
		int [] array2 = {1, 2, 0};
		int result2 = lowestPositive(array2);
		
		System.out.println(result2);
	}
	
	private static int lowestPositive(int [] array1)
	{		
		Arrays.sort(array1);
	
		for(int i = 0; i < array1.length - 1; i++)
		{
			if((((array1[i + 1]) != (array1[i] + 1)) && (array1[i + 1] != array1[i]) && (array1[i] > -1)))
			{
					return (array1[i] + 1);
			}
		}
		
		return array1[array1.length-1] + 1;
	}
}
