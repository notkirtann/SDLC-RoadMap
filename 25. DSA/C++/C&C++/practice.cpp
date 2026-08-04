#include<iostream>
using namespace std;
struct Bank{
    private:
    string name;
    int acc;
    float amt;
public:
void data()
{
    cout<<"Enter the Account Holder Name"<<endl;
    cin>>name;
    cout<<"Enter the Account Number"<<endl;
    cin>>acc;
    cout<<"Enter the Amount"<<endl;
    cin>>amt;
}
void print()
{
    cout<<"the Account Holder Name is"<<name<<endl;
    cout<<"the Account Number is"<<acc<<endl;
    cout<<"the Amount is"<<amt<<endl;
}
};
int main()
{
    Bank hero;
    hero.data();
    hero.print();
    return 0;
}