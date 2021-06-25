#include <iostream>
#include <string>

using namespace std;

int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    int n, day = 0, debt = 0, max = 0;
    cin >> n;
    for (int i = 1; i <= n; i++) {
        string cmd;
        int amount;
        cin >> cmd >> amount;
        if (cmd == "borrow") {
            debt += amount;
            if (debt > max) {
                day = i;
                max = debt;
            }
        } else {
            debt -= amount;
        }
    }
    printf("%d", day);
}
