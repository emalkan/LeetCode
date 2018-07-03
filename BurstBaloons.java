Given n balloons, indexed from 0 to n-1. Each balloon is painted with a number on it represented by array nums. You are asked to burst all the balloons. If the you burst balloon i you will get nums[left] * nums[i] * nums[right] coins. Here left and right are adjacent indices of i. After the burst, the left and right then becomes adjacent.

Find the maximum coins you can collect by bursting the balloons wisely.

Note:

You may imagine nums[-1] = nums[n] = 1. They are not real therefore you can not burst them.
0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100
Example:

Input: [3,1,5,8]
Output: 167 
Explanation: nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
             coins =  3*1*5      +  3*5*8    +  1*3*8      + 1*8*1   = 167
             
//Code

class Solution {
     public int maxCoins(int[] nums) {
         List<Integer> al = new ArrayList<Integer>();
         
         for(int i=0;i<nums.length;i++){
             al.add(nums[i]);
         }
         
         return maxCoins(al);
     }
    public int maxCoins(List<Integer> al) {
        
        int mul=1;
        int sum=0;
       
       while(true)
       {
           if(al.size()==0)
           {
               return sum;
           }
           else if(al.size()==1)
           {
               sum+= al.get(0);
               al.remove(0);
               continue;
           }
           else if(al.size()==2){
               sum+= al.get(0)*al.get(1);
               al.remove(0);
               continue;
           }
           else
           {
               //System.out.println(al.get(0));
               //System.out.println(al.get(1));
               //System.out.println(al.get(2));
               //System.out.println(al.size());
               sum+=al.get(0)*al.get(1)*al.get(2);
               al.remove(1);
           }
       }
        //return sum;
        
    }
}
