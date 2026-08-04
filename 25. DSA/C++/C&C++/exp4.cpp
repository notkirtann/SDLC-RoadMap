#include <iostream>

class ListNode {
public:
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(nullptr) {}
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
    std::cout << "Enter the values inserted before the head " << std::endl;
    for(int i = 0; i < 5; i++) {
        std::cin >> arr[i];
        head = solution.insertBeforeHead(head, arr[i]);
    }
    ListNode* current = head;
    std::cout << std::endl;
    std::cout << "The final linked list is :" << std::endl;
    while (current != nullptr) {
        std::cout << current->val << " ";
        current = current->next;
    }
    return 0;
}