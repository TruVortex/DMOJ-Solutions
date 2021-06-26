#include <stdio.h>
#include <algorithm>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int mpow(int base, int exp) {
    long long ans = 1;
    for (int i = 0; i < exp; i++) {
        ans = (ans * base) % 1000000007;
    }
    return (int) ans;
}

int main() {
    int f, n, ans = 0;
    scan(f);
    scan(n);
    int flowers[f];
    for (int i = 0; i < f; i++) {
        scan(flowers[i]);
    }
    sort(flowers, flowers + f);
    for (int i = n - 1; i >= 0; i--) {
        ans += mpow(flowers[i], n - i);
        ans %= 1000000007;
    }
    printf("%d", ans);
}
