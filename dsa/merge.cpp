#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;


void inputVector(vector<int>& arr) {
    for(int i = 0; i < arr.size(); i++) {
        cin >> arr[i];
    }
}

vector<int> mergeArrays(vector<int>& a, vector<int>& b) {
    vector<int> merged;

    for(int x : a) {
        merged.push_back(x);
    }

    for(int x : b) {
        merged.push_back(x);
    }

    sort(merged.begin(), merged.end());

    return merged;
}

double mean(vector<int>& arr) {
    int sum = 0;

    for(int num : arr) {
        sum += num;
    }

    return (double)sum / arr.size();
}

int main() {
    int n1, n2;

    cout << "Enter size of first array: ";
    cin >> n1;

    vector<int> arr1(n1);

    cout << "Enter elements of first array: ";
    inputVector(arr1);

    cout << "Enter size of second array: ";
    cin >> n2;

    vector<int> arr2(n2);

    cout << "Enter elements of second array: ";
    inputVector(arr2);

    cout << "\nArray 1: ";
    for(int x : arr1) {
        cout << x << " ";
    }

    cout << "\nArray 2: ";
    for(int x : arr2) {
        cout << x << " ";
    }

    vector<int> merged = mergeArrays(arr1, arr2);

    cout << "\nMerged Sorted Array: ";
    for(int x : merged) {
        cout << x << " ";
    }

    cout << "\nMean of Merged Array = " << mean(merged) << endl;

    return 0;
}