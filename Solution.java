import java.io.*;
import java.util.*;
 class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        Scanner in=new Scanner(System.in);
        String input=in.next();
        
        //System.out.println(input);
        
        String getMeridiem=input.substring(8);
        //System.out.println(getMeridiem);
        int gethour=Integer.parseInt(input.substring(0,2));
        //System.out.println(gethour);
        if(getMeridiem.equals("PM")&&gethour!=12)
        {
        	gethour=gethour+12;
        }
        if(getMeridiem.equals("AM")&&gethour==12)
        {
        	gethour=0;
        }
        
        //System.out.println(gethour);
        //to check if gethour is two digits
        
        String hour=gethour+"";
        if(hour.length()==1)
        	hour="0"+hour;
        	
        	System.out.println(hour+input.substring(2,8));
        
    }
}
