#include<iostream>
using namespace std;

void RectanglePatten(int rows){
for(int i=0;i<rows;i++)
{
    for(int j=0;j<rows;j++)
    {
        cout<<"* ";
    }
    cout<<endl;
}
}
void TRIANGLEPATTEN(int rows){
for(int i=1;i<=rows;i++)
{
    for(int j=1;j<=i;j++)
    {
        cout<<"* ";
    }
    cout<<endl;
}
}
void TRIANGLE_NUMBER_PATTEN(int rows)
{
    for(int i=1;i<=rows;i++)
{
    for(int j=1;j<=i;j++)
    {
        cout<<j;
    }
    cout<<endl;
}
}
void TriangleNumberPatter (int rows){
cout<<"TRIANGLE NUMBER PATTEN"<<endl;
cout<<" 1 22 333";    
for(int i=1;i<=rows;i++)
{
    for(int j=1;j<=i;j++)
    {
        cout<<j;
    }
    cout<<endl;
}
}
void ReverseStarPattern (int rows)
{
cout<<"Reverse PATTEN"<<endl; 
for(int i=rows;i>=0;i--)
{
    for(int j=1;j<=i;j++)
    {
        cout<<"*";
    }
    cout<<endl;
}
}
void Reverse_Pattern_Number(int rows)
{
cout<<"Reverse PATTEN number"<<endl;
cout<<"12345 1234 123 12 1"; 
for(int i=rows;i>=0;i--)
{
    for(int j=1;j<=i;j++)
    {
        cout<<j;
    }
    cout<<endl;
}
}
void FloydPattern(int rows)
 {
    int k=1;
    for(int i=1;i<=rows;i++)
    {
        for(int j=1;j<=i;j++)
        {
            cout<<k<<" ";
            k++;
        }
        cout<<endl;
    }
 }
void ZeroOne(int rows)
{
    for(int i=1;i<=rows;i++)
    {
        for(int j=1;j<=i;j++)
        {
            if((i+j)%2==0) cout<<"1 ";
            else cout<<"0 ";
        }
        cout<<endl;
    }
}
void Rhombus(int rows)
{
    for(int i=1;i<=rows;i++){
        for(int j=rows;j>1;j--) 
        {
            cout<<" ";
        }
        for(int j=1;j<=rows;j++)
        {
            cout<<"*";
        }
        cout<<endl;
    }
    
}
void EquilateralTraingle(int rows)
{
cout<<"Equilateral Triangle"<<endl; 
for(int i=0;i<rows;i++)
{
    for(int j=0;j<rows-i-1;j++)
    {
        cout<<" ";
    }
    for(int j=0;j<2*i+1;j++)
    {
        cout<<"*";
    }
    for(int j=0;j<rows-i-1;j++)
    {
        cout<<" ";
    }
    cout<<endl;
}
}
void OppEquilateralTraingle(int rows)
{
cout<<"Equilateral Triangle"<<endl; 
for(int i=0;i<rows;i++)
{
    for(int j=0;j<i;j++)
    {
        cout<<" ";
    }
    for(int j=0;j<(2*rows)-(2*i+1);j++)
    {
        cout<<"*";
    }
    for(int j=0;j<i;j++)
    {
        cout<<" ";
    }
    
    cout<<endl;
}
}
void EquiTriangleStraightRev(int rows)
{
    for(int i=0;i<rows;i++)
{
    for(int j=0;j<rows-i-1;j++)
    {
        cout<<" ";
    }
    for(int j=0;j<2*i+1;j++)
    {
        cout<<"*";
    }
    for(int j=0;j<rows-i-1;j++)
    {
        cout<<" ";
    }
    cout<<endl;
}
for(int i=0;i<rows;i++)
{
    for(int j=0;j<i;j++)
    {
        cout<<" ";
    }
    for(int j=0;j<(2*rows)-(2*i+1);j++)
    {
        cout<<"*";
    }
    for(int j=0;j<i;j++)
    {
        cout<<" ";
    }
    
    cout<<endl;
}
}
void pattern10Striver(int rows)
{
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<i;j++)
        {
            cout<<"*";
        }
        cout<<endl;
    }
    for(int i=0;i<rows;i++)
    {
        for(int j=rows;j>i;j--)
        {
            cout<<"*";
        }
        cout<<endl;

    }
}
void pattern12(int rows)
{
    int space = 2*(rows-1);
    for(int i=1;i<=rows;i++)
    {
        for(int j=1;j<=i;j++)
        {
            cout<<j;
        }
        for(int j=1;j<=space;j++)
        {
            cout<<" ";
        }
        for(int j=i;j>=1;j--)
        {
            cout<<j;
        }
        cout<<endl;
        space = space -2;
    }
}
void CharacterTriangle(int rows)
{
    for(int i=0;i<rows;i++)
    {
        for(char ch = 'A';ch <='A'+ i;ch++)
        {
            cout<<ch<<" ";
        }
        cout<<endl;

    }
}
void CharacterTriangleRev(int rows)
{
    for(int i=0;i<rows;i++)
    {
        for(char ch = 'A';ch <='A'+(rows-i-1);ch++)
        {
            cout<<ch<<" ";
        }
        cout<<endl;

    }
}
void ChracterPattern16(int rows)
{   char ch = 'A';
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<=i;j++)
        {
            cout << char(ch + i)<<" ";
        }
        cout<<endl;
    }
}
void CharacterPatter17(int rows)
{
    for(int i=0;i<rows;i++)
    {
        //space
        for(int j=1;j<=rows-i-1;j++)
        {
            cout<<" ";
        }
        //pattern
        char ch = 'A'; 
        for(int j=1;j<=2*i+1;j++)
        {
            cout<<ch;
            if(j<=(2*i+1)/2) ch++;
            else ch--;
        }
        //space
        for(int j=1;j<=rows-i-1;j++)
        {
            cout<<" ";
        }
        cout<<endl;
    }
}
void CharacterP18(int rows)
{
    for(int i=0;i<rows;i++)
    {
        for(char ch='E'- i;ch<='E';ch++)
        {
            cout<<ch<<" ";
        }
        cout<<endl;
    }
}
void Pattern19(int rows)
{
    int space =0;
    for(int i=0;i<rows;i++)
    {
        
        //stars
        for(int j=0;j<rows-i;j++)
        {
            cout<<"*";
        }
        //space
        for(int j=0;j<space;j++ )
        {
            cout<<" ";
        }
        //stars
        for(int j=0;j<rows-i;j++)
        {
            cout<<"*";
        }
        cout<<endl;
        space +=2;
    } 
    int space2=8;
    for(int i=0;i<rows;i++)
    {
        //stars
        for(int j=0;j<=i;j++)
        {
            cout<<"*";
        }
        //space
        for(int j=0;j<space2;j++ )
        {
            cout<<" ";
        }
        //stars
        for(int j=0;j<=i;j++)
        {
            cout<<"*";
        }
        cout<<endl;
        space2 -=2;
    }
}
void Pattern20Nutterfly(int rows)
{
    int space2=8;
    for(int i=0;i<rows;i++)
    {
        //stars
        for(int j=0;j<=i;j++)
        {
            cout<<"*";
        }
        //space
        for(int j=0;j<space2;j++ )
        {
            cout<<" ";
        }
        //stars
        for(int j=0;j<=i;j++)
        {
            cout<<"*";
        }
        cout<<endl;
        space2 -=2;
    }
    int space =2;
    for(int i=0;i<rows;i++)
    {
        
        //stars
        for(int j=1;j<rows-i;j++)
        {
            cout<<"*";
        }
        //space
        for(int j=0;j<space;j++ )
        {
            cout<<" ";
        }
        //stars
        for(int j=1;j<rows-i;j++)
        {
            cout<<"*";
        }
        cout<<endl;
        space +=2;
    }
}
void Pattern21HolloRect(int rows)
{
    for(int i=1;i<=rows;i++)
    {
        for(int j=1;j<=rows;j++)
        {
            if(i==1 or j==1 or i==rows or j==rows)
            {
                cout<<"*";
            }
            else
            {
                cout<<" ";
            }
        }
        cout<<endl;
    }
}
void MadarchodPattern22(int rows)
{
    {
     for(int i=0;i<2*rows-1;i++)
     {    
         for(int j=0;j<2*rows-1;j++)
        {
            int top = i;
            int bottom = j;
            int right = (2*rows - 2) - j;
            int left = (2*rows - 2) - i;
            cout<<(rows- min(min(top,bottom), min(left,right)))<<" ";
        }
         cout<<endl;
     }      
}
}

int main()
{    
    //int rows,cols;
    //EquiTriangleStraightRev(5);
    // CharacterPatter17(5);
    MadarchodPattern22(5);
}