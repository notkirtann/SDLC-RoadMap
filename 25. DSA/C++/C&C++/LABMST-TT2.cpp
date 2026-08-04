#include<bits/stdc++.h>
using namespace std;

int josephus(int n,int k)
{
    if(n==1)
    {
        return 0;
    }
    else{
        return(josephus(n-1,k)+k)%n;
    }
}
int find_the_maximum(int k, int n){
    return josephus(n,k)+2;
}

int main()
{
    int n;
    int k;
    cout<<"Enter the value of N: " ;
    cin>>n;

    cout<<"Enter the value of K: " ;
    cin>>k;

    int winner = find_the_maximum(n,k);

    cout<<"Winner is friend number : "<<winner<<endl;

    return 0;
}