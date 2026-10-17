#include <iostream>
using namespace std;

void pt1(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << "*";
        }
        cout << endl;
    }
    cout << endl;
}

void pt2(int n) {
    for (int i = n - 1; i >= 0; i--) {
        for (int j = i; j >= 0; j--) {
            cout << "*";
        }
        cout << endl;
    }
    cout << endl;
}

void pt3(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= n - i - 1; j++) {
            cout << " ";
        }

        for (int k = 0; k < 2 * i + 1; k++) {
            cout << "*";
        }
        cout << endl;
    }
}

int main() {
    int n = 4;
    pt1(n); 
    pt2(n);
    pt3(n);
}