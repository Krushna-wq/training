#include <iostream>
using namespace std;

bool isArmstrong(int num) {
    int k = to_string(num).length();
    int sum = 0;
    int n = num;

    while (n > 0) {
        int x = n % 10;
        sum += pow(x, k);
        n /= 10;
    }

    return sum == num;
}

bool isPerfect(int num) {
    int sum = 0;

    for (int i = 1; i < num; i++) {
        if (num % i == 0) {
            sum += i;
        }
    }

    return sum == num;
}

int main() {
    int num, choice;

    cout << "Enter a number: ";
    cin >> num;
do{
    cout << "1. Prime Number\n";
    cout << "2. Armstrong Number\n";
    cout << "3. Perfect Number\n";
    cout << "0. Exit\n";
    cout << "Enter your choice: ";
    cin >> choice;

    switch (choice) {
        case 1:
            if (checkPrime(num))
                cout << num << " is Prime"<<endl;
            else
                cout << num << " is Not Prime"<<endl;
            break;

        case 2:
            if (isArmstrong(num))
                cout << num << " is Armstrong"<<endl;
            else
                cout << num << " is Not Armstrong"<<endl;
            break;

        case 3:
            if (isPerfect(num))
                cout << num << " is Perfect"<<endl;
            else
                cout << num << " is Not Perfect"<<endl;
            break;
        
        case 0:
            cout << "Exit" << endl;
            break;

        default:
            cout << "Invalid Choice";
    }
} while (choice !=0);

    return 0;
} 