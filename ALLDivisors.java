/*
You are given a natural number ‘N’. Find all the divisors of the number ‘N’. Print them in increasing order.

Example:
Input: ‘N’ = 10 

Output: [1, 2, 5, 10]

1, 2, 5, and 10 are the only divisors of the number 10.
*/
public static ArrayList<Integer> getAllDivisors(int n){
		// Write your code here.
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=1;i<=n;i++){
			if(n%i==0){
				result.add(i);
			} 
		}
		return result;
	}
