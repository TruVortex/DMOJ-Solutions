#include <stdio.h>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int main() {
    int x, n;
    scan(x);
    scan(n);
    int ans = (n + 1) * x;
    for (int i = 0, temp; i < n; i++) {
        scan(temp);
        ans -= temp;
    }
    printf("%d", ans);
    return 0;
}
