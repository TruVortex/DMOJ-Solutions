#include <iostream>
#include <string>

using namespace std;

int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    string str;
    while (cin >> str) {
        if (str.length() == 1 && !(str == "a" || str == "e" || str == "i" || str == "o" || str == "u")) {
            printf("not readable");
            return 0;
        } else if (str.length() != 1) {
            int c = 0, v = 0;
            for (char ch : str) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    v++;
                } else {
                    c++;
                }
            }
            if (abs(c - v) > 1) {
                printf("not readable");
                return 0;
            }
        }
    }
    printf("readable");
}
