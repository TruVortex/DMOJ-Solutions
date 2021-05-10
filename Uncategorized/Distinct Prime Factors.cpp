#include <stdio.h>
#define scan(x) do{while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0');}while(0)
char _;

int dp[1000001];

int main() {
    for (int i = 2; i <= 1000000; i++) {
        if (!dp[i]) {
            for (int j = i; j <= 1000000; j += i) {
                dp[j]++;
            }
        }
    }
    int a, b;
    scan(a);
    scan(b);
    for (int i = a; i <= b; i++) {
        printf("%d\n", dp[i]);
    }
    return 0;
}
