#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    int n, chars[26] = {}, ans = 0;
    string str;
    cin >> n >> str;
    for (char ch : str) {
        chars[ch - 'a']++;
    }
    for (int temp : chars) {
        if (temp % 2) {
            ans++;
        }
    }
    printf("%d", max(1, ans));
    return 0;
}
