#include <iostream>
using namespace std;
int main () 
{
    cout <<" Welcome to the Word of Searching Here is the Code of Linear Search and Binary Search" <<  endl;
    int number; 
    cout << " Press 1 For Linear Search and 2 For Binary Search "<<endl; cin >> number; 
    switch (number)
    { 
        case 1:
        {
            int key;
            int	n;
            int i;
            cout << "Enter the size of the array :: " << endl;
            cin>> n;
            int ar[n];
            cout << "Enter the Array for linear search :: " << endl; 
            for (i = 0; i < n; i++)
            {
                cin >> ar[i];
                
            }
            cout << "Enter the Element to search :: " << endl; 
            cin >> key; 
            for (i = 0; i < n; i++)
            {
                if (key == ar[i])
                {
                    cout << "The element is found at :: " << i + 1;
                    break;
                }
            }
            if (i == n)
            {
                cout << "Element not found ::)";
            }
            cout <<"You have Successfully Completed Linear Search"<< endl;
        }
        break; 
        
        case 2:
        {
            int n;
            cout << "Enter the size of the array ::" << endl; 
            cin>> n;
            int arr[n]; 
            int start = n - 1; 
            int end = 0; 
            cout << "Enter the sorted array for Binary Search :: " << endl;
            
            for (int i = 0; i <= start; i++)
            {
                cin >> arr[i];
            }
            
            int Key;
            cout << "Enter the Element to Search :"<< endl; 
            cin >> Key;
            while (end <= start)
            {
                int mid = (start + end) / 2 ; 
                if (Key == arr[mid])
                {
                    cout << "Element found at index :) " << mid + 1 << endl; 
                    return mid;
                }
                else if (Key < arr[mid])
                {
                    start = mid - 1;
                }
                else if (Key > arr[mid])
                {
                    end = mid + 1;
                }
            } 
            if (end > start)
            {
                cout << "Element not found :)  " << endl;
            }
            cout <<"You have Successfully Completed Linear Search"<< endl;
            return -1;
        } 
        break;
    }
return 0;
}

