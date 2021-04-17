#include <stdio.h>
#include <algorithm>
#define scan(x) do{while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0');}while(0) // positive ints only
char _;

using namespace std;

int main() {
    long long n, d, k, x, p, cnt = 0;
    scan(n);
    scan(d);
    scan(k);
    scan(x);
    x = 100 - x;
    long long alpacas[n];
    for (int i = 0; i < n; i++) {
        scan(alpacas[i]);
    }
    sort(alpacas, alpacas + n);
    scan(p);
    while (true) {
        n--;
        if (n == -1) {
            printf("YES");
            break;
        }
        while (alpacas[n] >= p) {
            alpacas[n] = (long long) ((alpacas[n] / 100.0) * x);
            cnt++;
            if (cnt > k) {
                printf("NO");
                return 0;
            }
        }
    }
    return 0;
}
