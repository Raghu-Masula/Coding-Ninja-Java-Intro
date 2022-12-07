/*
Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.
Input Format :
String S
Output Format :
Minimum length word
Constraints :
1 <= Length of String S <= 10^5
Sample Input 1 :
this is test string
Sample Output 1 :
is
Sample Input 2 :
abc de ghihjk a uvw h j
Sample Output 2 :
a
*/

//sollution

public class Solution {
	
	public static String minLengthWord(String input){
		
		// Write your code here
        String word="", small="";
        String[] words=new String[1000];
        int l=0;
        
        input=input+" ";
        
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)!=' '){
                word=word+input.charAt(i);
            }
            
            else{
                words[l]=word;
                l++;
                word="";
            }
        }
        small=words[0];
        
        for(int j=0;j<l;j++){
            if(small.length()>words[j].length()){
                small =words[j];
            }
        }
        return small;
	}
}


//main
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.println(Solution.minLengthWord(str));
	}

}
