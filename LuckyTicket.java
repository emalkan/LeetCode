/**
 * @(#)LuckyTicket.java
 *
 *
 * @author 
 * @version 1.00 2017/7/17

Refer https://www.hackerrank.com/contests/ucsc-ieee-preextreme-challenge-2016/challenges/nssc-problem-1/problem

You are given a number 1 ≤ N ≤ 5. Every ticket has its 2N-digit number. We call a ticket lucky,

if the sum of its first N digits is equal to the sum of its last N digits. You are also given the sum

of ALL digits in the number. Your task is to count an amount of lucky numbers, having the

specified sum of ALL digits.

Input Format

Two space-separated numbers: N and S. Here S is the sum of all digits.

Constraints

0 ≤ S ≤ 100

Output Format

The amount of lucky tickets.

Sample Input

2  2

Sample Output

4
*/
import java.util.*;

public class LuckyTicket {

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String x= sc.next();
	 
	 
	 int Left=Integer.parseInt(x.substring(0,3));
	 int Right=Integer.parseInt(x.substring(3));
System.out.println(Left);
System.out.println(Right);
	 int SumLeft=x.charAt(0)+x.charAt(1)+x.charAt(2);//lets say 10
    int SumRight=x.charAt(3)+x.charAt(4)+x.charAt(5);//lets say 13
    
    //Conditions
    
    
       
	
	

}
    public static void getLuckyTicket(char input[]) {
    	int in[]=new int[6];
for(int i=0;i<6;i++)
{
in[i]= Integer.parseInt(input[i]+"");	
}
//int Left=Integer.parseInt(left);
//int Right=Integer.parseInt(right);


    int SumLeft=in[0]+in[1]+in[2];//lets say 10
    int SumRight=in[3]+in[4]+in[5];//lets say 13
    
    int diff=SumLeft-SumRight;
    in[5]+=diff%9;
    
    
    
    System.out.println(Arrays.toString(in));


    	
    }
    
    
}
