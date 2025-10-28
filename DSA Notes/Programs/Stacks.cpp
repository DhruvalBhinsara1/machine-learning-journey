#include <iostream>
#include <stack>
#include <string>

using namespace std;

int main() {
    stack<string> stack;

    stack.push("GTA V");
    stack.push("Minecraft");
    stack.push("The Witcher 3");

    // Print the top element
    cout << stack.top() << endl; // The Witcher 3

    // Search for "Minecraft" by popping from a temporary stack
    stack<string> temp = stack;  // Correct usage of template argument <string>
    int pos = 1;
    bool found = false;
    while (!temp.empty()) {
        if (temp.top() == "Minecraft") {
            found = true;
            cout << pos << endl;
            break;
        }
        temp.pop();
        pos++;
    }
    if (!found) {
        cout << -1 << endl;
    }

    // Print the stack contents from bottom to top by reversing temporary stack
    temp = stack;
    stack<string> reversed;  // Correct usage here as well
    while (!temp.empty()) {
        reversed.push(temp.top());
        temp.pop();
    }
    cout << "[";
    while (!reversed.empty()) {
        cout << reversed.top();
        reversed.pop();
        if (!reversed.empty()) cout << ", ";
    }
    cout << "]" << endl;

    return 0;
}

