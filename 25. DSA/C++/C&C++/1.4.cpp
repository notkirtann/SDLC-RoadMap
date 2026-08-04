#include<iostream>
using namespace std;
class student
{
    string name;
    int rollno;
    int height;
    int weight;

    public:
    student(string n, int r,int h,int w)
    {
        name=n;
        rollno=r;
        height=h;
        weight=w;
    }
void display(void);
~student();
};
void student::display(void)
{
    cout<<"Student details: "<<endl;
    cout<<"Name"<<name<<"Roll Number"<<rollno<<"Height"<<height<<"Weight"<<weight;
}
student::~student()
{
    cout<<"destructor called"<<endl;
}
int main()
{
    cout<<"Kirtan Nahar"<<endl;
    cout<<"UID: 21BCS8762\n"<<endl;
    student std("ABC",1234,6,78);
    student std1=std;
    std1.display();
    return 0;
}