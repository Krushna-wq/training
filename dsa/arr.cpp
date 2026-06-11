#include <iostream>
#include <vector>
using namespace std;

int main() {
    int size;

    cout << "Enter the size of array: ";
    cin >> size;

    vector<int> arr(size);

    cout << "Enter the array elements: ";
    for(int i = 0; i < size; i++) {
        cin >> arr[i];
    }

    cout << "\nArray in forward direction: ";
    for(int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }

    cout << "\nArray in backward direction: ";
    for(int i = size - 1; i >= 0; i--) {
        cout << arr[i] << " ";
    }

    int sum = 0;
    for(int i = 0; i < size; i++) {
        sum += arr[i];
    }

    double avg = (double)sum / size;
    cout << "\n average = " << avg;

    cout << "\n elements at even position: ";
    for(int i = 1; i < size; i += 2) {   
        cout << arr[i] << " ";
    }

    int maxElement = arr[0];
    for(int i = 0; i < size; i++) {
        if (arr[i] > maxElement) {
            maxElement = arr[i];
        }
    }

    cout << "\nMaximum element = " << maxElement << endl;

    return 0;   
}