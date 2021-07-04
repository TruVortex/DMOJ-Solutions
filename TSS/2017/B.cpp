#include <stdio.h>
#include <math.h>
#include <algorithm>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int main() {
    int n, q;
    scan(n);
    scan(q);
    double houses[n];
    for (int i = 0; i < n; i++) {
        double x, y;
        scanf("%lf%lf", &x, &y);
        houses[i] = sqrt(x * x + y * y);
    }
    sort(houses, houses + n);
    for (int i = 0, r; i < q; i++) {
        scan(r);
        printf("%d\n", upper_bound(houses, houses + n, r) - houses);
    }
}
