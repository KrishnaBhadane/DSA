//LeetCode 704 — Binary Search

#include <iostream>
#include <algorithm>
using namespace std;

int main() {

    //array and key is fixed...!!
    int key = 2;
    int arr[7];
    int n = 7;

    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    sort(arr, arr + n);

    int stidx = 0, endidx = n - 1;
    bool isFound = false;
    while (stidx <= endidx) {
        int mid = (stidx + endidx) / 2;

        if (arr[mid] == key) {
            cout << "Key is found : " << mid << endl;
            isFound = true;
            return 0;
        }

        else if (arr[mid] < key) {
            stidx = mid + 1;
        }

        else {
            endidx = mid - 1;
        }

    }

    if (!isFound) cout << "Key not found" << endl;

    return 0;

    
}