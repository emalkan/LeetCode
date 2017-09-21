/**
 * @(#)LongestCommonSubsequence.java
 *
 *
 * @author 
 * @version 1.00 2017/7/20
 Given 2 Strings, this code helps to find the longest common subsequence and the count
 */
import java.util.*;

public class LongestCommonSubsequence {

    public LongestCommonSubsequence() {
    }
    public static void main(String args[])
    {
    	System.out.println("Input String 1");
    	Scanner sc=new Scanner(System.in);
    	String input1=sc.next();
    	System.out.println("Input String 2");
    	String input2=sc.next();
    	
    	int Count[][]=new int[input1.length()+1][input2.length()+1];
    	
    	String longseq="";
    	
    	for(int i=1;i<=input1.length();i++)
    	{
    		for(int j=1;j<=input2.length();j++)
    		{
    			if(input1.charAt(i-1)==input2.charAt(j-1))
    			{
    				Count[i][j]=Count[i-1][j-1]+1;
    				longseq+=input1.charAt(i-1);
    			}
    				
    			else
    			{
    				Count[i][j]= java.lang.Math.max(Count[i-1][j],Count[i][j-1]);
    			}
    		}
    	}
    	
    	
    	System.out.println("The Lngest sequence count is :"+ Count[input1.length()][input2.length()]);
    	System.out.println("The longest sequence is :" +longseq);
    }
    
}
