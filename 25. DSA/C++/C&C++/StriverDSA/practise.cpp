#include<bits/stdc++.h>
using namespace std;
int answer(int num)
{
    int count=0;
    while(num>0){
        count+=1;
        num=num/10;        
    }
    return num;
}

int main()
{
    int number = 12345;

    int rev = answer(number);

    cout<< rev ;
    return 0;
}