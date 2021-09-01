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

import org.bouncycastle.asn1.dvcs.Data;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'maxStreak' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. STRING_ARRAY data
     */

	public static void maxStreak(int m, List<String> data) {
		//public static int maxStreak(int m, List<String> data) {
    	
		int total_employees=m;
		int total_allPresent=0;
		String attendance=null;
		
		for (int i=0;i<total_employees;i++)
		{
			if(attendance==null)
			{
				attendance="Y";
			}
			else
			{
				attendance+="Y";
			}
					
		}
		
		for (int index=0;index<data.size();index++)
		{
			if (attendance.equalsIgnoreCase(data.get(index)))
			{
				total_allPresent++;
			}
		}
			
		System.out.println("Total Present Days :" + Integer.toString(total_allPresent));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        int dataCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> data = IntStream.range(0, dataCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        Result.maxStreak(m, data);
        //int result = Result.maxStreak(m, data);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
  //      bufferedWriter.close();
    }
}