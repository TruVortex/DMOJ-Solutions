// compile with clang
#include <stdio.h>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;
#define MAXB 100001
#define MAXFACTORS 128

static int dp[MAXB + 1];
static int otherdp[MAXFACTORS + 1][MAXB + 1];

int main() {
    for (int i = 1; i <= MAXB; i++) {
        for (int j = i; j <= MAXB; j += i) {
            dp[j]++;
        }
        otherdp[dp[i]][i] = 1;
    }
    for (int i = 1; i <= MAXFACTORS; i++) {
        for (int j = 1; j <= MAXB; j++) {
            otherdp[i][j] += otherdp[i][j - 1];
        }
    }
    int t;
    scan(t);
    while (t--) {
        int k, a, b;
        scan(k);
        scan(a);
        scan(b);
        if (k > MAXFACTORS) {
            printf("0\n");
        } else {
            printf("%d\n", otherdp[k][b] - otherdp[k][a - 1]);
        }
    }
    return 0;
}
