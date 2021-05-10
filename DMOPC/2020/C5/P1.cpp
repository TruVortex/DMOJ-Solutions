#include <iostream>

using namespace std;

int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    string s1, s2;
    cin >> s1 >> s2;
    int lcs = 0;
    for (int i = 0; i < s1.length(); i++) {
        if (s1[i] == s2[i]) {
            lcs++;
        } else {
            break;
        }
    }
    cout << s1.length() + s2.length() - lcs - lcs << "\n";
    return 0;
}
