package recursion_Lab;

public class ArraySum {
	
	public int sumOfArray(Integer[]array, int n)
	{
		if(n == 0) {
			return 0;
		}
		else {
			return array[n-1] + sumOfArray(array, n-1);
		}
	}}
