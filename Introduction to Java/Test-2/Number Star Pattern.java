/*
Print the following pattern for given number of rows.
Input format :

Line 1 : N (Total number of rows)

Sample Input :
   5
Sample Output :
1234554321
1234**4321
123****321
12******21
1********1
*/

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i<=n){
            int j =1;
            while (j<=n-i+1){
                System.out.print(j);
                j++;
            }
            int k=i-1;
            while (k>0) {
                System.out.print("*");
                k--;
            }
            int k1 =i-1;
            while (k1>0){
                System.out.print("*");
                k1--;
            }
           int j1=n-i+1;
            while (j1>0){
                System.out.print(j1);
                j1--;
            }
            System.out.println();
            i++;
        }	

	}
}
