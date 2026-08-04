#include<bits/stdc++.h>
using namespace std;
//creating LL structutre
class Node{
    public:
    int data;
    Node* next;

    Node(int data1,Node* next1)
    {
        data = data1;
        next = next1;
    }
    Node(int data1)
    {
        data = data1;
        next = nullptr;
    }  

};
//converting  array to linked list 
Node* convertArr2LL(vector<int> &arr)
{
    Node* head = new Node(arr[0]);
    Node* mover = head;
    for (int i=1;i<arr.size();i++)
    {
        Node* temp = new Node(arr[i]);
        mover->next = temp;
        mover = temp;
    }
    return head;
}
int main() 
{
    vector<int> v={2,3,5,7,9};
    // Constructing the linked list from the given array
    Node  *head = convertArr2LL(v);
    
    cout << "Linked List Head is : ";
    cout<< head->data <<endl<<"___________________"<<endl;

//traversing ll
    Node* temp = head;
    while(temp)
    {
        cout <<temp->data<<" ";
        temp = temp->next;
    }
    cout<<"\n";
    int newhead;
    cout<<"Enter New Element to become head: ";
    cin>>newhead;
    Node* newnode = new Node(newhead);
    newnode->next = head;
    cout<<"New head is "<<newnode->data<<endl;

    Node* temp2 = newnode;
    while(temp2)
    {
        cout <<temp2->data<<" ";
        temp2 = temp2->next;
    }

    return 0;
}