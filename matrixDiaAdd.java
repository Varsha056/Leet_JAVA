/*
3 
1 2 3
4 5 6
7 8 9
o/p 25
*/
import java.util.* ;
import java.io.*; 
// 1 2 3 5
// 4 5 6 8
// 7 8 9 6
// 5 6 3 1


// 0,0 1,1 2,2 3,3   0,3 1,2 2,1 3,1
public class Solution {

    public static int maximumPoints(int n, int[][] grid)
    {
       // Write your code here.
       int point = 0;

       for(int i =0;i<n;i++){
           point+= grid[i][i];
           point+= grid[i][n-i-1];
       }
       if(n%2!=0){
           point-=grid[n/2][n/2];
       }

       return point;
    }
}
