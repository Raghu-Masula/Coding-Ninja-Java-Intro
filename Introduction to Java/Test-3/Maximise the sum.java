/*
Given 2 sorted arrays (in increasing order), find a path through the intersections that produces maximum sum and return the maximum sum.
That is, we can switch from one array to another array only at common elements.
If no intersection element is present, we need to take sum of all elements from the array with greater sum.
Input Format :
 Line 1 : An integer M i.e. size of first array
 Line 2 : M integers which are elements of first array, separated by spaces
 Line 3 : An integer N i.e. size of second array
 Line 4 : N integers which are elements of second array, separated by spaces
Output Format :
Maximum sum value
Constraints :
1 <= M, N <= 10^6
Sample Input :
6
1 5 10 15 20 25
5
2 4 5 9 15
Sample Output :
81
Explanation :
We start from array 2 and take sum till 5 (sum = 11). Then we'll switch to array at element 10 and take till 15. So sum = 36. Now, no elements left in array after 15, so we'll continue in array 1. Hence sum is 81
*/

//sollution

public class Solution {

	public static long maximumSumPath(int[] input1, int[] input2) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, they are passed as function arguments.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		
        long maxi =0;
        long s1=0,s2=0;
        int i=0,j=0;
        
        while(i<input1.length && j<input2.length){
            if(input1[i]<input2[j]){
                s1+=input1[i];
                i++;
            }
            else if(input1[i]>input2[j]){
                s2+=input2[j];
                j++;
                
            }
            else{
                maxi+=Math.max(s1,s2)+input1[i];
                s1=0;
                s2=0;
                i++;
                j++;
            }
        }
        while(i<input1.length)
            s1+=input1[i++];
        
            while(j<input2.length)
                s2+=input2[j++];
        maxi+=Math.max(s1,s2);
        
        return maxi;
        
            
        
	}
}

//main
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int input1[] = new int[m];
        for(int i = 0; i < m; i++) {
        	input1[i] = s.nextInt();
        }
        int n = s.nextInt();
        int input2[] = new int[n];
        for(int i = 0; i < n; i++) {
        	input2[i] = s.nextInt();
        }
        System.out.println(Solution.maximumSumPath(input1, input2));
	}

}
