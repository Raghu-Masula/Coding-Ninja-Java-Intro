/*
Print the following pattern for the given number of rows.
Pattern for N = 4
4444444
4333334
4322234
4321234
4322234
4333334  
4444444
Input format : N (Total no. of rows)

Output format : Pattern in N lines

Sample Input :
3
Sample Output :
33333
32223
32123
32223
33333
*/

//sollution

public class solution {

	public static void print(int n) {
	//Write your code here
        int s=2*n-1;
        int front =0;
        int back=s-1;
        int a[][]=new int[s][s];
        while(n!=0){
            for(int i=front;i<=back;i++){
                for (int j=front;j<=back;j++){
                    if(i==front|| i==back || j==front|| j==back){
                        a[i][j]=n;
                    }
                }
              
            }
            ++front;
                --back;
                --n;
            
        }
        print(a,s);
	}
    
    public static void print(int a[][], int size)
    {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

}


//main

import java.util.Scanner;

public class runner {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		solution.print(n);
        s.close();
	}

}

