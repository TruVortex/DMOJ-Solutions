#include <stdio.h>
#include <algorithm>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int main() {
    int N, x, y, R;
    scan(N);
    scan(x);
    scan(y);
    scan(R);
    long long ans = 0;
    for (int i = 0, l, r; i < R; i++) {
        scan(l);
        scan(r);
        l = max(x, l);
        r = min(y, r);
        if (l <= r) {
            ans += r - l + 1;
        }
    }
    printf("%lld", ans);
}
