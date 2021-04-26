#include <iostream>
#include <string>

using namespace std;

int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    int n, late = 0, queue = 0;
    string str;
    cin >> n;
    while (true) {
        cin >> str;
        if (str == "EOF") {
            break;
        } else if (str == "CLOSE") {
            cout << late << " " << queue << " " << n << "\n";
            late = 0;
            queue = 0;
        } else if (str == "SERVE") {
            queue--;
        } else {
            queue++;
            late++;
            n++;
            if (n == 1000) {
                n = 1;
            }
        }
    }
    return 0;
}
