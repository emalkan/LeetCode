

/**
https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem

**/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n+k];
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        for(int j=0;j<k;j++)
        {
        	a[n+j]=a[j];
        	a[j]=0;
        }
         int b[]=new int[n];
         System.arraycopy(a,k,b,0,n);
         
         
        
        for(int i=0;i<n;i++)
        {
        	System.out.print((b[i])+" ");
        }
    }
}
