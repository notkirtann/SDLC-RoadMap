#include<bits/stdc++.h>
using namespace std;

void functionn(int i){
    if(i==0) return;
    cout<<i;
    functionn(i-1);
     
}
void sumofN(int i,int sum)
{
    if(i==0) {cout<<sum; return;}
    sumofN(i-1,sum+i);
}
int nonsumofN(int n)
{
    if(n==0) return 0;
    return n + nonsumofN(n-1);
}
int facto(int n)
{
    if(n==1) return 1;
    return n * facto(n-1);
}

int main()
{
    int a;
    cout<<facto(5);
}