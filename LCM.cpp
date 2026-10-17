#include <iostream>
using namespace std;

int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
}

int main() {
    int a, b;
    cin >> a >> b;
    int hcf = gcd(a, b);
    cout << "GCD : " << hcf << endl;
    int lcm = (a * b) / hcf;
    cout << "LCM : " << lcm << endl;
} 