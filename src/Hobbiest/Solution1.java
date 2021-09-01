package automationFramework;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result1 {

    /*
     * Complete the 'perfectTeam' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING skills as parameter.
     */

    public static void perfectTeam(String skills) {
//    	  public static int perfectTeam(String skills) {
    // Write your code here

    	int[] size = {0,0,0,0,0};
    	
    	
    	for (int i=0;i<skills.length();i++)
    	{
    		if (skills.charAt(i)=='p')
    		{
    			size[0]++;
    		}else if (skills.charAt(i)=='c')
    		{
    			size[1]++;
    		}else if (skills.charAt(i)=='m')
    		{
    			size[2]++;
    		}else if (skills.charAt(i)=='b')
    		{
    			size[3]++;
    		}else if (skills.charAt(i)=='z')
    		{
    			size[4]++;
    		}
    	}
    	int temp;
    for (int i=0;i<size.length;i++)
    {
    	for (int j=i+1; j<size.length;j++)
    	{
    		if (size[i]>size[j])
    		{
    			temp=size[i];
    			size[i]=size[j];
    			size[j]=temp;
    			
    		}
    	}
    }
    System.out.println(size[0]);
    }

}

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String skills = bufferedReader.readLine();

          Result1.perfectTeam(skills);
//        int result = Result.perfectTeam(skills);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedReader.close();
//        bufferedWriter.close();
//    
        }
}