/*
Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)
where F(0) = 0 and F(1) = 1


Input Format :
Integer N
Output Format :
true or false
Constraints :
0 <= n <= 10^4
Sample Input 1 :
5
Sample Output 1 :
true
Sample Input 2 :
14
Sample Output 2 :
false    
*/

//solution

public class Solution {
	
	public static boolean checkMember(int n){
				
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
        int a =0;
		int b=1;
		int c=0;
        int d=0;
		while (d<n){
			c=a+b;
			a=b;
			b=c;
            d=c;

		}
		boolean ifFibonacci = true;

		if (d != n) {
			ifFibonacci = false;
		}
        else{
            ifFibonacci=true;
        }
        
		return ifFibonacci;
        

	}
	

}


//Main code

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Solution.checkMember(n));
	}

}
