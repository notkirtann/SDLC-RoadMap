class Solution {
public:
    int pivotInteger(int n) {
      int last=(n*(n+1))/2,right=0;

      while(last>right){
        right+=n;
        if(right==last)return n;
        last-=n;
        n--;
      }
      return -1;
    }
};