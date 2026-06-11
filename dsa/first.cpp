#include <iostream>
using namespace std;

int number1, number2;

void add() {
    cout << "Addition = " << number1 + number2 << endl;
}

void sub() {
    cout << "Subtraction = " << number1 - number2 << endl;
}

void mult() {
    cout << "Multiplication = " << number1 * number2 << endl;
}

void divideNum() {
    cout << "Division = " << (double)number1 / number2 << endl;
}

void mod() {
    cout << "Modulus = " << number1 % number2 << endl;
}

int main() {
    int choice;

    do {
        cout << "\n Choose Any Operator\n";
        cout << "1. Add\n";
        cout << "2. Subtract\n";
        cout << "3. Multiply\n";
        cout << "4. Divide\n";
        cout << "5. Modulus\n";
        cout << "6. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        if (choice >= 1 && choice <= 5) {
            cout << "Enter first number: ";
            cin >> number1;

            cout << "Enter second number: ";
            cin >> number2;
        }

        switch (choice) {
            case 1:
                add();
                break;

            case 2:
                sub();
                break;

            case 3:
                mult();
                break;

            case 4:
                if (number2 == 0) {
                    cout << "Division by zero is not possible" << endl;
                } else {
                    divideNum();
                }
                break;

            case 5:
                if (number2 == 0) {
                    cout << "Modulus by zero is not possible!" << endl;
                } else {
                    mod();
                }
                break;

            case 6:
                cout << "Exiting Calculator..." << endl;
                break;

            default:
                cout << "Invalid choice! " << endl;
        }

    } while (choice != 6);

    return 0;
}