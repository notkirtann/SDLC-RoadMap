#include<bits/stdc++.h>
using namespace std;
int main()
{  
	vector<int> ans ={1,2,3,4,5,6,7};

	for(auto i=ans.begin(); i<ans.end(); i++)
	{
		cout<<" "<<*i;
	}
	cout<<endl;

	ans.insert(ans.begin()+2,16);

	for(auto i=ans.begin(); i<ans.end(); i++)
	{
		cout<<" "<<*i;
	}
	return 0;
}