//leetcode 7
#include <iostream>
using namespace std;

int reverseNumber(int n) {
    int reverse = 0;
    while (n != 0) {
        int z = n % 10;
        //condition here if number exceeds
        reverse = reverse * 10 + z;
        n /= 10;
    }

    return reverse;
}

int main() {
    int n = 352;
    cout << reverseNumber(n) << endl;
    cout << (n == reverseNumber(n) ? "Palindrome" : "Not Palindrome") << endl;
    return 0;
}