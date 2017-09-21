/**
 * @(#)MyLuckyTicket.java
 *
 *
 * @author 
 * @version 1.00 2017/7/19
 */

import java.util.*;
public class MyLuckyTicket {

    public MyLuckyTicket() {
    }
    public static void main(String args[])
{

    Scanner sc=new Scanner(System.in);
   
    
    String x= sc.next();
    
    	makeLucky(x);
    	
    	
    
    
    
    
    
}
public static boolean checkLucky(int SumLeft, int SumRight)
{
	//System.out.println("inside CL");
    if(SumLeft==SumRight)
    {
    	//System.out.println("LuckyTicket"+SumLeft+""+SumRight);
    	return true;
    }
    else
    {
    		//System.out.println("Not LuckyTicket"+SumLeft+""+SumRight);
    		return false;
    }
    
    	
}


public static void makeLucky(String x)
{
	
	int LH=Integer.parseInt(x.charAt(0)+"");
    int LT=Integer.parseInt(x.charAt(1)+"");
    int LU=Integer.parseInt(x.charAt(2)+"");
    int RH=Integer.parseInt(x.charAt(3)+"");
    int RT=Integer.parseInt(x.charAt(4)+"");
    int tempRU, RU=Integer.parseInt(x.charAt(5)+"");
    //System.out.println("before A");
    
    
    int SumLeft=LH+LT+LU;
    int SumRight=RH+RT+RU;
    
    if(SumLeft>SumRight)
	{
		int diff=SumLeft-SumRight;
		int temp=RU+diff;
		if(temp<9)
		{
			RU+=diff;
			SumLeft=LH+LT+LU;
    		SumRight=RH+RT+RU;
			if(checkLucky(SumLeft,SumRight))
			{
				System.out.println(LH+""+LT+""+LU+""+RH+""+RT+""+RU+"");
	return;
			}
	{
		
		System.out.println(LH+""+LT+""+LU+""+RH+""+RT+""+RU+"");
	return;
	}
		}
			
		
		//System.out.println("SL>SR RightSide"+RH+""+RT+""+RU+""); 
	}
	
	A: //System.out.println("at A"); 
		RU=0;
	if(RT!=9)
		RT=RT+1;
		else
		{
		
				if(RH!=9)
				{
						RT=0; 
						RH=RH+1;
				}
					
				else
				{
					LU=LU+1;
				}
		}
	//now check
	B: SumLeft=LH+LT+LU;
	SumRight=RH+RT+RU;
	//System.out.println("RightSide"+RH+""+RT+""+RU+""); 
	if(SumLeft>SumRight)
	{
		int diff=SumLeft-SumRight;
		RU=diff;
		//System.out.println("SL>SR RightSide"+RH+""+RT+""+RU+""); 
	}
	else
	{
		RT=0;
		RH=RH+1;
		SumRight=RH+RT+RU;
		int diff=SumLeft-SumRight;
		RU=diff;
	//System.out.println("SR>SL RightSide"+RH+""+RT+""+RU+""); 
	}
	SumRight=RH+RT+RU;
	
	//now check 
	if(checkLucky(SumLeft,SumRight))
	{
		
		System.out.println(LH+""+LT+""+LU+""+RH+""+RT+""+RU+"");
	return;
	}
	else{
		String y=LH+""+LT+""+LU+""+RH+""+RT+""+RU+"";
	makeLucky(y);
	}
}

}
