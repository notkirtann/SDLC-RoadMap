#include<bits/stdc++.h>
using namespace std;

int sum(int num1,int num2){
return num1 + num2;
}

void printName1()
{
    cout<<"Hey Kirtan"<<endl;
}

void printName2(string name)
{
    cout<<"hey"<<name<<endl;
}

void PassByRef(string &a)//changes original 
//array always goes by refrence mean orifianl only without & sign
{
    a[0]='c';
    cout<<a<<endl;
}
void PassByValue(string b)//takes copy and change
{
    b[0]='b';
    cout<<b<<endl;
}

int main()
{
    int n1,n2;
    string name2;
    cin>>n1>>n2;
    cin>>name2;
    printName1();
    cout<<sum(n1,n2)<<endl;
    printName2(name2);

    string s = "Raj";
    PassByRef(s);
    cout<<s<<endl;

    string x = "kirtan";
    PassByValue(x);
    cout<<x<<endl;
}