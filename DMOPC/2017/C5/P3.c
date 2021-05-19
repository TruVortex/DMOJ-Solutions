#include <stdio.h>
#include <math.h>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

long long gcdF(long long a, long long b) {
    if (b == 0) {
        return a;
    }
    return gcdF(b, a % b);
}

int main() {
    int n;
    scan(n);
    long long gcd, ans, temp;
    scanf("%lld", &gcd);
    for (int i = 1; i < n; i++) {
        scanf("%lld", &temp);
        gcd = gcdF(gcd, temp);
    }
    if (gcd == 1) {
        printf("DNE");
        return 0;
    }
    while (gcd % 2 == 0) {
        ans = 2;
        gcd /= 2;
    }
    for (int i = 3; i <= sqrt(gcd); i += 2) {
        while (gcd % i == 0) {
            ans = i;
            gcd /= i;
        }
    }
    if (gcd != 1) {
        ans = gcd;
    }
    printf("%lld", ans);
}
