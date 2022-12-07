/*

public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int n= arr1.length;
        int m =arr2.length;
        int arr3[]=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        
        
          
            while(i<n && j<m){
                if(arr1[i]<arr2[j]){
                    arr3[k]=arr1[i];
                    i++;
                    k++;
                }
                else{
                    arr3[k]=arr2[j];
                    j++;
                    k++;
                }
            }
            while(i<n){
                arr3[k]=arr1[i];
                i++;
                k++;
                    
                }
        	while(j<m){
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        return arr3;
    }

}
*/

//sollution
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
        String[] strNums; 
        strNums = br.readLine().split("\\s");
        

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input1 = takeInput();
            int[] input2 = takeInput();
            int[] ans = Solution.merge(input1, input2);
            printArray(ans);

            t -= 1;
        }
    }
}