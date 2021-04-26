#include <iostream>
#include <string>

using namespace std;

int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    long long n1 = 1LL, n2 = 2e9, mid = 1e9;
    string str;
    while (true) {
        printf("%lld\n", mid);
        cin >> str;
        if (str == "OK") {
            break;
        } else if (str == "SINKS") {
            n1 = mid + 1;
        } else {
            n2 = mid - 1;
        }
        mid = (n1 + n2) / 2;
    }
    return 0;
}
