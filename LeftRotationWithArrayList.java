import java.util.*;
/**
 * @(#)LeftRotationWithArrayList.java
 *
 *
 * @author 
 * @version 1.00 2017/8/12


Refer https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem for problem Statement

 */


public class LeftRotationWithArrayList {

    public LeftRotationWithArrayList() {
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        
    
    ArrayList<Integer> al=new ArrayList<Integer> (n+k);
    for(int i=0;i<n;i++)
    {
    	al.add(in.nextInt());
    }
    
    int count=0;
    while(count<k)
    {
    	al.add(al.get(0));
    	al.remove(0);
    	count++;
    }
    	
    
    for(int i=0;i<al.size();i++)
    	System.out.print(al.get(i)+" ");
    
    }
}
