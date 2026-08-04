#include<iostream>
using namespace std;
int main()
{   int rows,cols;

    cin>>rows;//>>cols;
//RECTANGLE PATTEN
//     for(int i=0;i<n;i++)
//     {
//         for(int j=0;j<m;j++)
//         {
//             cout<<"* ";
//         }
//         cout<<endl;
//     }
        //HOLO RECTANGLE
        // for(int i=0;i<rows;i++)
        // {
        //     for(int j=0;j<cols;j++)
        //     {
        //         if(i==0 || i==rows-1 || j==0 || j==cols-1)
        //         {
        //             cout<<"*";
        //         }
        //         else{
        //             cout<<" ";
        //         }
        //     }
        //     cout<<endl;
        // }

    // //inverted pyramid
    // for(int i=rows;i>0;i--)
    // {
    //     for(int j=0;j<i;j++)
    //     {
    //         cout<<"* ";
    //     }
    //     cout<<endl;
    // }    

    // // Pyramid

    // for(int i=1;i<=rows;i++)
    // {
    //     for(int j=1;j<=i;j++)
    //     {
    //         cout<<"* ";
    //     }
    //     cout<<endl;
    // }

    // //Half Pyramid 180 degree Rotation
    // //    *
    // //   **
    // //  ***
    // for(int i = 0;i<rows;i++)
    // {
    //     for(int j=0;j<rows;j++)
    //     {
    //         if(j<rows-i)
    //         {
    //             cout<<" ";// single space pr half doubel space + " *"==>> equi Triangle.
    //         }
    //         else
    //         {
    //             cout<<"*";//if " *" than equi triangle
    //                         //    *
    //                         //   * *
    //                         //  * * *
    //         }
    //     }
    //     cout<<endl;
    // }

    //Half Pyramid Using Number
    // for(int i=1;i<=rows;i++)
    // {
    //     for(int j=1;j<=i;j++)
    //     {
    //         cout<<i<<" ";// agar i toh 1        agar j hai toh 1
    //                              //    2 2                     1 2
    //                              //    3 3 3                   1 2 3 
    //                              //    4 4 4 4                 1 2 3 4 
    //     }
    //     cout<<endl;
    // }

    //FLOYD TRIANGLE
    // int k =1;
    // for(int i=0;i<rows;i++)
    // {
    //     for(int j=0;j<i;j++)
    //     {
    //         cout<<k++<<" ";            
    //     }
    //     cout<<endl;
    // }

    //BUTTERFLY PATTERN
    for(int i=0;i<2*rows;i++)
    {
        for(int j=0;j<i;j++)
        {
            cout<<" *";
        }
        
        for(int j=rows;j<2*rows;j++)
        {
            if(j<2*rows-rows)
            {
                cout<<"  ";// single space pr half doubel space + " *"==>> equi Triangle.
            }
            else
            {
                cout<<" *";//if " *" than equi triangle
                            //    *
                            //   * *
                            //  * * *
            }
        }
        cout<<endl;
    }


    }


