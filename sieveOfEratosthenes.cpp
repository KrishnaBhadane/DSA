//Leetcode 204
#include <iostream>
#include <vector>
using namespace std;

int countPrime(int n) {

    if (n <= 2) return 0;

    vector <bool> vec(n, true);
    int count = 0;
    
    for (int i = 2; i < n; i++) {
        if (vec[i]) {
            count++;
            for (int j = i * i; j < n; j+=i) {
                vec[j] = false;
            }
        }
    }

    return count;
}

int main() {
    int n = 50;
    cout << countPrime(n) << endl;
}