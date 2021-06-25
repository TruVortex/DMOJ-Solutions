#include <iostream>
#include <string>
#include <unordered_map>

using namespace std;

int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    unordered_map<string, int> words;
    int n, ans = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        string str;
        cin >> str;
        words[str]++;
    }
    for (pair<string, int> p : words) {
        if (p.second == 1) {
            ans++;
        }
    }
    printf("%d", ans);
}
