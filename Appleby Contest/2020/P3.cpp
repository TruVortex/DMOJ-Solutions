#include <iostream>
#include <string>

using namespace std;

int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    int n, m;
    string s, t;
    cin >> n >> m >> s >> t;
    int nxt[n + 1][26];
    for (int i = 0; i <= n; i++) {
        for (int j = 0; j < 26; j++) {
            nxt[i][j] = -1;
        }
    }
    for (int i = n - 1; i >= 0; i--) {
        for (int j = 0; j < 26; j++) {
            nxt[i][j] = nxt[i + 1][j];
        }
        nxt[i][s[i] - 'a'] = i;
    }
    int cur = 0;
    long long ans = 0;
    for (int i = 0; i < m; i++) {
        int c = t[i] - 'a';
        if (nxt[0][c] == -1) {
            cout << -1;
            return 0;
        }
        int pos = nxt[cur][c];
        if (pos == -1) {
            ans += n - cur + nxt[0][c] + 1;
            cur = nxt[0][c] + 1;
        } else {
            ans += pos - cur + 1;
            cur = pos + 1;
        }
    }
    cout << ans;
    return 0;
}
