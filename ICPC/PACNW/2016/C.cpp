#include <stdio.h>
#include <deque>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int main() {
    int n, k, r, ans = 0;
    scan(n);
    scan(k);
    scan(r);
    bool houses[n] = {};
    for (int i = 0, temp; i < k; i++) {
        scan(temp);
        houses[temp] = true;
    }
    deque<int> window;
    for (int i = 0; i < r; i++) {
        if (!houses[i]) {
            window.push_back(i);
        }
    }
    for (int i = r; i < n; i++) {
        while (r - window.size() < 2) {
            window.pop_back();
            ans++;
        }
        if (!window.empty() && window.front() == i - r) {
            window.pop_front();
        }
        if (!houses[i]) {
            window.push_back(i);
        }
    }
    while (r - window.size() < 2) {
        window.pop_back();
        ans++;
    }
    printf("%d\n", ans);
}
