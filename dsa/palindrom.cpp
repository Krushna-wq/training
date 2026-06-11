#include <iostream>
#include <string>
#include <algorithm>
#include <cctype>
using namespace std;

int main() {
    int choice;

    do {
        cout << "\n===== STRING OPERATIONS MENU =====\n";
        cout << "1. Count Spaces\n";
        cout << "2. Count Alphabets\n";
        cout << "3. Print Each Word on New Line\n";
        cout << "4. Count Words\n";
        cout << "5. Concatenate Two Strings\n";
        cout << "6. Check Palindrome\n";
        cout << "7. Reverse String\n";
        cout << "8. Check Anagram\n";
        cout << "9. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;
        cin.ignore();

        string str, str1, str2;

        switch (choice) {
        case 1: {
            cout << "Enter a sentence: ";
            getline(cin, str);

            int spaces = 0;
            for (char ch : str) {
                if (ch == ' ')
                    spaces++;
            }

            cout << "Number of spaces = " << spaces << endl;
            break;
        }   

        case 2: {
            cout << "Enter a sentence: ";
            getline(cin, str);

            int alphabets = 0;
            for (char ch : str) {
                if (isalpha(ch))
                    alphabets++;
            }

            cout << "Number of alphabets = " << alphabets << endl;
            break;
        }

        case 3: {
            cout << "Enter a sentence: ";
            getline(cin, str);

            cout << "Words in new lines:\n";

            string word = "";
            for (char ch : str) {
                if (ch == ' ') {
                    cout << word << endl;
                    word = "";
                } else {
                    word += ch;
                }
            }
            cout << word << endl;
            break;
        }

        case 4: {
            cout << "Enter a sentence: ";
            getline(cin, str);

            int words = 1;
            for (char ch : str) {
                if (ch == ' ')
                    words++;
            }

            cout << "Number of words = " << words << endl;
            break;
        }

        case 5: {
            cout << "Enter first string: ";
            getline(cin, str1);

            cout << "Enter second string: ";
            getline(cin, str2);

            cout << "Concatenated String = " << str1 + str2 << endl;
            break;
        }

        case 6: {
            cout << "Enter a string: ";
            getline(cin, str);

            string rev = str;
            reverse(rev.begin(), rev.end());

            if (str == rev)
                cout << "Palindrome\n";
            else
                cout << "Not Palindrome\n";

            break;
        }

        case 7: {
            cout << "Enter a string: ";
            getline(cin, str);

            reverse(str.begin(), str.end());

            cout << "Reversed String = " << str << endl;
            break;
        }

        case 8: {
            cout << "Enter first string: ";
            getline(cin, str1);

            cout << "Enter second string: ";
            getline(cin, str2);

            sort(str1.begin(), str1.end());
            sort(str2.begin(), str2.end());

            if (str1 == str2)
                cout << "Anagram\n";
            else
                cout << "Not Anagram\n";

            break;
        }

        case 9:
            cout << "Exiting Program...\n";
            break;

        default:
            cout << "Invalid Choice!\n";
        }

    } while (choice != 9);

    return 0;
}