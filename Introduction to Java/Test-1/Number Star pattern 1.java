/*
Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321
 */
 import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		// Write your code here
        	
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i=1;i<N+1;i++)
        {
                     for(int j=0;j<N-i;j++)
                    {
                        System.out.print(N-j);
                    } 
            
                    System.out.print("*");
            
                    for(int k=i-1;k>0;k--)
                    {
                        System.out.print(k);
                    } 
            
            
        System.out.println();
        }

	}
}
