#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <algorithm>

int main() {
    int t;
    scanf("%d", &t);
    for (int i = 0; i < t; i++) {
        long long n, s;
        scanf("%lld%lld", &n, &s);
        long long req = n * (n + 1) / 2, a = (req - s) / 2, b = req - s - a, ans = 0;
        if (a == b) {
            a--;
            b++;
        }
        if (b + a <= n) {
            ans = a;
        }
        if (a - n + b >= 1) {
            ans = std::max(ans, n - b + 1);
        }
        printf("%lld\n", ans);
    }
    return 0;
}
