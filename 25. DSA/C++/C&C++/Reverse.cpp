#include <iostream>
#include <vector>
using namespace std;

vector<int> reverseArray(vector<int> A) 
{
    int start = 0;
    int end = A.size() - 1;
    
    while (start < end) 
    {
        swap(A[start], A[end]);
        start++;
        end--;
    }
 return A;
}

int main() {
    cout<<"Enter the Size of Array"<<endl;
    int N;
    cin >> N;
    
    vector<int> A(N);
    
    cout<<"Enter the Array Element "<<endl;
    for (int i = 0; i < N; i++) 
    {
        cin >> A[i];
    }
    cout<<"The Reverse Array : ";
    vector<int> result = reverseArray(A);
    for (int i = 0; i < N; i++) 
    {
        cout << result[i] << " ";
    }

    return 0;
}