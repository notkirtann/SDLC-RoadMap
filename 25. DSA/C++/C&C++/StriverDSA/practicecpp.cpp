#include<bits/stdc++.h>
using namespace std;
void bubble_sort(int arr[],int n){
    for (int i = n-1; i >=1; i--)
    {
        for(int j = 0; j <= i; j++)
        {
            if(arr[j]>arr[j+1])
            swap(arr[j],arr[j+1]);
        }
    }
}

void selecition_sort(int arr[],int n){
    for(int i=0;i<=n-2;i++){
        int min =i;
        for(int j=i;j<=n-1;j++)
        {
            if(arr[j] < arr[min])
            min = j;
        }
        swap(arr[i],arr[min]);
     }
}
void insertion_sort(int arr[],int n)
{
    for(int i=0;i<=n-1;i++)
    {
        int j=i;
        while(j>0 && arr[j-1] > arr[j])
       {
            swap(arr[j-1],arr[j]);
            j--;
       }  
    }
}

int main() {
    cout<<"helloword";
    // int bub[6] = {9,5,10,2,1,8};
    // bubble_sort(bub,6);
    // for(int i=0;i<6;i++) cout<<bub[i]<<" ";
    // int sel[6] = {34,78,23,67,90,4} ;
    // selecition_sort(sel,6);
    // for(int i =0;i<6;i++) cout<<sel[i]<<" ";
    int ins[6]= {4,3,7,1,8,2};
    insertion_sort(ins, 6);
    for (int i = 0; i < 6; i++)
        cout << ins[i] << " ";
    return 0;
}
