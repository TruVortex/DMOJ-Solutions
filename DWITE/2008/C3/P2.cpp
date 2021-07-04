#include <iostream>
#include <string>

using namespace std;

int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    for (int i = 0; i < 5; i++) {
        string s;
        getline(cin, s);
        int cnt = 0, cur = 0;
        for (int j = 0; j < s.length(); j++) {
            if ((s[j] >= 'a' && s[j] <= 'z') || (s[j] >= 'A' && s[j] <= 'Z')) {
                cur++;
            } else {
                if (cur >= 4) {
                    cnt++;
                }
                cur = 0;
            }
        }
        if (cur >= 4) {
            cnt++;
        }
        cout << cnt << "\n";
    }
    return 0;
}
