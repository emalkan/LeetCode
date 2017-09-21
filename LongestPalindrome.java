/**
 * @(#)longestpalindrome.java
 *
 *
 * @author 
 * @version 1.00 2017/3/26
 */
import java.util.*;

public class longestpalindrome {

    public longestpalindrome() {
    }
    
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	String in=sc.next();
    	String length= findLongestPal(in);
    	
    	System.out.println(length);
    }
    public static String findLongestPal(String input)
    {
    	int max=0;
    	String longestPal="";
    
    	for(int i=0;i<input.length()-1;i++)
    	{
    		for(int j=i+1; j<input.length();j++)
    		{
    			String s=input.substring(i,j+1);
    			int curr=midPalindrome(s);
    			
    			if(max<curr)
    			{
    			
    				max=curr;
    				longestPal=s;
    			}
    		}
    	}
    		
    		
    		
    		
    		//check whether even is greater or odd
    		
    		return longestPal;
    		
    }
    
    
    public static int midPalindrome(String s)
    {
    	
    	
    		char in[]=s.toCharArray();
    	boolean flag=false;
    	int n=in.length;
   		//if(n%2==0)//even nittin
   		{
   			for(int i=0;i<n/2;i++)
   			{
   				if(in[i]==in[n-i-1])
   					flag=true;
   				else
   				{
   				flag=false;
   				break;	
   				}
   										
   				
   			}
   			
   			//System.out.println(s+" "+flag);
   			if(flag)
   			return n;
   			else return -1;
   		}
    
    }
}
