#include <stdio.h>
#include <algorithm>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int main() {
    int n, k, l = 0, r = 1, ans = 0;
    scan(n);
    scan(k);
    int luggage[n];
    for (int i = 0; i < n; i++) {
        scan(luggage[i]);
    }
    sort(luggage, luggage + n);
    while (l < n && r < n) {
        if (luggage[r] - luggage[l] <= k) {
            r++;
        } else if (luggage[r] - luggage[l] > k) {
            l++;
        }
        ans = max(ans, r - l);
    }
    printf("%d", ans);
    return 0;
}
