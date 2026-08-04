#include<iostream>
using namespace std;
class FIRST{
    int a;
};
class SECOND{
    int b,c;
    public:
    void putdata();
    friend void sum(int,int);
};
void sum(SECOND a,SECOND b)
{ 
    int c;
    c=a+b;
    cout<<c;
}
void SECOND::putdata()
{
    cout<<"Enter the a and b values "<<endl;
    cin>>a>>b;
}
int main()
{
    SECOND s;
    s.getdata();
    s.sum(s.a,s.b);
}