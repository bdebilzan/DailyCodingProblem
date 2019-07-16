package daily_coding_problem;

//[Easy]
//
//This problem was recently asked by Google.
//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//
//For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
//Bonus: Can you do this in one pass?
//
//[Did this in n^2. Can be improved to n by doing in one pass].

public class Problem_1 {

	public static void main(String[] args) {
		
		int [] array1 = {10, 15, 3, 7};
		int k = 17;
		
		boolean addsUp = doesItAddUpToK(array1, k);
		
		System.out.println(addsUp);
		
		k = 20;
		
		addsUp = doesItAddUpToK(array1, k);
		
		System.out.println(addsUp);
	}
	
	private static boolean doesItAddUpToK(int [] array1, int k)
	{
		for(int i = 0; i < array1.length; i++)
		{
			for(int j = 0; j < array1.length; j++)
			{
				if(array1[i] + array1[j] == k && i != j)
				{
					return true;
				}
			}
		}
		
		return false;
	}
}
