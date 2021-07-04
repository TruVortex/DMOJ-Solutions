#include <stdio.h>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

int rows[1001], cols[1001];

int main() {
    int r, c;
    scan(r);
    scan(c);
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            char field = getchar();
            if (field == 'X') {
                rows[i]++;
                cols[j]++;
            }
        }
        getchar();
    }
    int q;
    scan(q);
    for (int i = 0, x, y; i < q; i++) {
        scan(x);
        scan(y);
        if (rows[y - 1] || cols[x - 1]) {
            printf("Y\n");
        } else {
            printf("N\n");
        }
    }
}
