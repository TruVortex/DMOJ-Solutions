#include <stdio.h>
#include <algorithm>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int main() {
    int n, ans = 0, weight = 0;
    scan(n);
    for (int i = 0, temp; i < n; i++) {
        scan(temp);
        if (temp % 2) {
            ans = max(ans, weight);
            weight = 0;
        } else {
            weight += temp;
        }
    }
    ans = max(ans, weight);
    printf("%d", ans);
}
