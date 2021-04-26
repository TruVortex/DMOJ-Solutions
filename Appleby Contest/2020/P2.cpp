#include <stdio.h>
#define scan(x) do{while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0');}while(0)
char _;

long long playdough[100001];

int main() {
    int n, q;
    scan(n);
    scan(q);
    for (int i = 0; i < n; i++) {
        int temp;
        scan(temp);
        playdough[temp]++;
    }
    for (int i = 0; i < q; i++) {
        int n1, n2;
        scan(n1);
        scan(n2);
        if (n1 == 1) {
            if (n2 % 2 == 0) {
                playdough[n2 / 2] += playdough[n2] + playdough[n2];
            } else {
                playdough[n2 / 2] += playdough[n2];
                playdough[n2 / 2 + 1] += playdough[n2];
            }
            playdough[n2] = 0;
        } else {
            printf("%lld\n", playdough[n2]);
        }
    }
    return 0;
}
