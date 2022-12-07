/*
For a given string(str), remove all the consecutive duplicate characters.
Example:
Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc"
 Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
Output Format:
The only line of output prints the updated string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aabccbaa
Sample Output 1:
abcba
Sample Input 2:
xxyyzxx
Sample Output 2:
xyzx
*/

//sollution

public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        String n="";
        int a =Integer.MIN_VALUE;
        
        for(int i=0;i<str.length();i++){
            
            if(a!=(int)str.charAt(i)){
                n=n+str.charAt(i);
                a=(int)str.charAt(i);
            }
            
        }
        return n;
        
	}

}

//main
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Runner {

	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	public static void main (String [] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim ();
		} else {
			str = "";
		}

		String ans = Solution.removeConsecutiveDuplicates(str);

		System.out.println(ans);
		
	}
}

