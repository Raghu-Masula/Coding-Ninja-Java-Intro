/*
Odd Square
Send Feedback
Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357

*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int maxodd = 1+(n-1)*2;
        int oddcount = 0;

        while(i<=n) {
        	int j = 1;
            int odd = 1;
            odd =odd+oddcount;

            while(j <= n) {
            	if(odd>maxodd){
                odd=1;
            }
            System.out.print(odd);
            odd = odd+2;
            j++;
    	}

        System.out.println();
        i++;
        oddcount=oddcount+2;
    	}
	}
}
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int maxodd = 1+(n-1)*2;
        int oddcount = 0;

        while(i<=n) {
        	int j = 1;
            int odd = 1;
            odd =odd+oddcount;

            while(j <= n) {
            	if(odd>maxodd){
                odd=1;
            }
            System.out.print(odd);
            odd = odd+2;
            j++;
    	}

        System.out.println();
        i++;
        oddcount=oddcount+2;
    	}
	}
}
