/*
Half Diamond Pattern
Send Feedback
Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*

*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
	
        Scanner s =new Scanner(System.in);

        int n = s.nextInt();
        //System.out.println('*');
        int i = 1;
        while (i<=n+1){
           int st =2;
            if (st<=i){
            System.out.print('*');
            }
            int j = 1;
            while (j<=i-1){
                System.out.print(j);
                j=j+1;

            }
            int k = i-2;
            int l = i-2;
            while (k>=1){
                System.out.print(l);
                l=l-1;
                k=k-1;
            }

            System.out.print('*');

            System.out.println();
            i=i+1;
        }
        i=n-1;
        while (i>=1){
            System.out.print('*');
            int j = 1;
            while (j<=i){
                System.out.print(j);
                j=j+1;
            }
            j=i-1;
            while (j>=1){
                System.out.print(j);
                j--;
            }
            System.out.print('*');
            System.out.println();
            i-=1;
        }
        System.out.println('*');


    }
}
