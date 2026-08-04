#include<iostream>
using namespace std;
int sum(int a,int b)
{
    return a+1;
}
int sum(float a,float b)
{
    return a*b;
}
main()
{
    float a;
    float b;
    cout<<"Enter the length and the breadth of rectangle"<<endl;
    cin>>a>>b;
    cout<<sum(a,b);
}