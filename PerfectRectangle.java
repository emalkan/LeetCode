/*
Given N axis-aligned rectangles where N > 0, determine if they all together form an exact cover of a rectangular region.

Each rectangle is represented as a bottom-left point and a top-right point. For example, a unit square is represented as [1,1,2,2]. (coordinate of bottom-left point is (1, 1) and top-right point is (2, 2)).


Example 1:

rectangles = [
  [1,1,3,3],
  [3,1,4,2],
  [3,2,4,4],
  [1,3,2,4],
  [2,3,3,4]
]

Return true. All 5 rectangles together form an exact cover of a rectangular region.

Example 2:

rectangles = [
  [1,1,2,3],
  [1,3,2,4],
  [3,1,4,2],
  [3,2,4,4]
]

Return false. Because there is a gap between the two rectangular regions.

Example 3:

rectangles = [
  [1,1,3,3],
  [3,1,4,2],
  [1,3,2,4],
  [3,2,4,4]
]

Return false. Because there is a gap in the top center.

Example 4:

rectangles = [
  [1,1,3,3],
  [3,1,4,2],
  [1,3,2,4],
  [2,2,4,4]
]

Return false. Because two of the rectangles overlap with each other.

*/


class Solution {
    
    static class Point{
    int x;
    int y;
    
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
        @Override
        public boolean equals(Object o) {
            if (o instanceof Point) {
                Point p = (Point)o;
                return this.x == p.x && this.y == p.y;
            }
            return false;
        }
        
        @Override
         public int hashCode() {
            int code = 1;
            code = code * 32221 + x;
            code = code * 32221 + y;
            return code;
        }
}
    public boolean isRectangleCover(int[][] rectangles) {
        if(rectangles.length==0 || rectangles[0].length==0)
            return false;
        int minX=Integer.MAX_VALUE;
        int minY=Integer.MAX_VALUE;
        int maxX=Integer.MIN_VALUE;
        int maxY=Integer.MIN_VALUE;
        int area=0;
        
        HashSet<Point> hs=new HashSet<Point>();
        
        for(int[] recti: rectangles){
            minX=Math.min(minX,recti[0]);
            minY=Math.min(minY,recti[1]);
            maxX=Math.max(maxX,recti[2]);
            maxY=Math.max(maxY,recti[3]);
            
            area+=Math.abs(recti[0]-recti[2])*Math.abs(recti[1]-recti[3]);
            
            Point s1=new Point(recti[0],recti[1]);
            Point s2=new Point(recti[0],recti[3]);
            Point s3=new Point(recti[2],recti[1]);
            Point s4=new Point(recti[2],recti[3]);
                
           
            
            if(!hs.add(s1)) hs.remove(s1);
            if(!hs.add(s2)) hs.remove(s2);
            if(!hs.add(s3)) hs.remove(s3);
            if(!hs.add(s4)) hs.remove(s4);
        }
        
        int fullarea= (maxX-minX)*(maxY-minY);
        //System.out.println(minX+" "+minY+" "+maxX+" "+maxY);
        
        //System.out.println(area);
        
        //System.out.println(fullarea);
        
      //  hs.forEach(System.out::println);
        
        if(!hs.contains(new Point(minX,minY)) || !hs.contains(new Point(minX,maxY)) || !hs.contains(new Point(maxX,minY)) || !hs.contains(new Point(maxX,maxY)) || hs.size()!=4)
            return false;
        
        return (area==fullarea);
    }
}
