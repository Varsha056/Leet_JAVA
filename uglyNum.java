/**
num should not be divisible by 2, 3 and 5
6 is ugly
1 is not
14 is not
**/
class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        while(n%2==0){
            n/=2;
        }
         while(n%3==0){
            n/=3;
        }
          while(n%5==0){
            n/=5;
        }
        return n==1;
    }
}
