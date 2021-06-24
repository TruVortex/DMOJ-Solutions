#include <stdio.h>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

int friends[100001];

int main() {
    int n;
    scan(n);
    for (int i = 1, pushups; i < n; i++) {
        scan(pushups);
        friends[pushups] = 1;
    }
    for (int i = 1; i <= n; i++) {
        if (!friends[i]) {
            printf("%d", i);
            break;
        }
    }
}
