#include<bits/stdc++.h>
using namespace std;
int smallest(int arr[],int n)
{
    
    int min = arr[0];
    for(int i = 1; i < n; i++)
    {
        if(arr[i]<min){
            min = arr[i];
        }
    }
    return min;
}
int biggest(int arr[], int n)
{
    int max = arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    return max;
}
int main(){
    // int n;
    // cin>>n;
    // int arr[n];
    // for(int i=0;i<n;i++)
    // {
    //     cin>>arr[i];
    // }
    int arr1 [10] = { 7,4,10,17,2,3,47,8,9,11};
    int min = smallest(arr1,10);
    cout<<min<<endl;
}