//Leetcode problem 20
#include <iostream>
#include <stack>
using namespace std;

bool validParentheses(string str) {
    stack <char> st;
    for (char s : str) {
        if (s == '(' || s == '{' || s == '[') {
            st.push(s);
        }

        if (s == ')' || s == '}' || s == ']') {
            if (st.empty()) return false;

            if (st.top() == '(' && s == ')') { st.pop(); continue; }
            else if (st.top() == '[' && s == ']') { st.pop(); continue; }
            else if (st.top() == '{' && s == '}') { st.pop(); continue; }
        }
    }

    if (st.empty()) return true;
        else return false;
}

int main() {
    string str = "[]({}))";
    if (validParentheses(str)) cout << "Valid" << endl;
    else cout << "Invalid" << endl;

    return 0;
}
