/*
Code : Diamond of stars
Send Feedback
Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5



The dots represent spaces.



Input format :
N (Total no. of rows and can only be odd)
Output format :
Pattern in N lines
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  *

  */


  import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        
      int n = s.nextInt();
        int n1 =(n/2)+1;
        int n2=n1-1;
        for (int i = 1;i<=n1;i++){
            for (int j = 1;j<=n2;j++){
                System.out.print(" ");
            }
            n2--;

            for (int k = 1;k<=(2*i)-1;k++){
                System.out.print('*');
            }
            System.out.println();
        }
        n2=1;
        for (int i =1;i<=(n1-1);i++){
            for (int j =1;j<=n2;j++){
                System.out.print(" ");
            }
            n2++;

            for (int k=1;k<=(2*(n1-i))-1;k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
