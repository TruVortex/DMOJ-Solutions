#include <stdio.h>
#include <math.h>
#include <vector>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
}

int main() {
    int n, m;
    scan(n);
    scan(m);
    printf("%d\n", n + m - gcd(n, m));
    vector<pair<int, int>> points;
    for (int i = 1; i <= n; i++) {
        int a = (long long) (i - 1) * m / n + 1, b = ((long long) i * m + n - 1) / n;
        for (int j = a; j <= b; j++) {
            printf("%d %d\n", i, j);
        }
    }
    return 0;
}
