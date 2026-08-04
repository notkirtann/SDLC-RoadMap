#include <iostream>
#include <vector>
#include <memory>
#include <cstdlib>

using namespace std;

// Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class LinkedListInsertBeforeHead {
public:
    ListNode* insertBeforeHead(ListNode* head, int value) {
        ListNode* newNode = new ListNode(value);       
        if (head != nullptr) {
            newNode->next = head;
        }       
        return newNode;
    }
};

int main() {
    LinkedListInsertBeforeHead solution;
    ListNode* head = nullptr; 
    int arr[10];
    cout << "Enter the values inserted before the head: ";
    for(int i = 0; i < 10; i++) {
        cin >> arr[i];
        head = solution.insertBeforeHead(head, arr[i]); 
    }
    
    ListNode* current = head;
    cout << endl << "The final linked list is:" << endl;
    while (current != nullptr) {
        cout << current->val << " ";
        current = current->next;
    }
    cout << endl;

    // Free memory
    current = head;
    while (current != nullptr) {
        ListNode* temp = current;
        current = current->next;
        delete temp;
    }

    return 0;
}
