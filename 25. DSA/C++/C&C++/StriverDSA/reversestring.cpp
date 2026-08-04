#include<bits/stdc++.h>
using namespace std;
    int main() {
        string str = "kirtan";
        int n = str.length()-1;
        int i = 0;
        while(i<=n)
        {
            swap(str[i],str[n]);
            i++;
            n--;
        }
        cout<<str;
    return 0;
}