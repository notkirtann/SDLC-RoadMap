#include<bits/stdc++.h>
using namespace std;

void selecition_sort(int arr[], int n)
{
    for(int i=0;i<=n-2;i++)
    {
        int min = i;
        for(int j=i;j<=n-1;j++)
        {
            if(arr[j]<arr[min])
            min = j;
        }
        swap(arr[min],arr[i]);
        // int temp = arr[min];
        // arr[min]= arr[i];
        // arr[i]= temp;
    }
}
void bubble_sort(int arr[],int n)
{
    for(int i = n-1;i>=1;i--)
    {
        int didSwap = 0;
        for(int j=0;j<=i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                swap(arr[j],arr[j+1]);
                // int temp = arr[j+1];
                // arr[j+1] = arr[j];
                // arr[j] = temp;
                didSwap = 1; //tells whether swaping is done
            }
        }
        if(didSwap=0) break;
        //cout<<i<<endl; tell how many time loops run
    }
}
void insertion_sort(int arr[],int n)
{
    for(int i=0;i<=n-1;i++)
    {
        int j=i;
        while(j>0 && arr[j-1]>arr[j])
        {
            swap(arr[j-1],arr[j]);
            j--;
        }
    }
}

void merge(vector<int>&v,int low,int mid,int high)
{
    vector<int> temp;
    int left = low;
    int right = mid+1;
    while(left<=mid && right<=high)
    {
        if(v[left]<=v[right]){
            temp.push_back(v[left]);
            left++;
        }
        else{
            temp.push_back(v[right]);
            right++;
        }
    }
    while(left<=mid){
        temp.push_back(v[left]);
            left++;
    }
    while(right<=high){
        temp.push_back(v[right]);
            right++;
    }
    for(int i= low;i<=high;i++){
        v[i]=temp[i-low];
    }
}
void mS(vector<int>& v, int low, int high)
{
    if(low==high) return;
    
    int mid = (low + high)/2;
    mS(v, low, mid); /* recursively sort left half */
    mS(v, mid+1, high);/* recursively sort right half */
    merge(v, low, mid, high);

}
void merge_sort(vector<int>&a,int n){
    mS(a,0,n-1);
}
int main()
{
    // int n;
    // cin>>n;
    // int arr[n];
    // for(int i=0;i<n;i++)
    // {
    //     cin>>arr[i];
    // }
    // int arr[6] = {9,5,10,2,1,8};
    // insertion_sort(arr,6);
    // for(int i=0;i<6;i++) cout<<arr[i]<<" ";
    
    vector<int> arr1={4,9,6,2,8,1,5};
    merge_sort(arr1,arr1.size());
    for(int i=0;i<6;i++) cout<<arr1[i]<<" ";
    
}