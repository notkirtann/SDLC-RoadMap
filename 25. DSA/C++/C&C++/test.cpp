

#include<bits/stdc++.h>
using namespace std;
int modify(int y,int z)
{
   y = y + 1;
  z = z + 1;
  return y - z;
}

int main()
{
 int a = 12, b = 20, c;
  c = modify(a, b);
  cout<<a<<endl;
  
  cout<<c;
    return 0;
}