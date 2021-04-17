#include <stdio.h>
#define scan(x) do{while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0');}while(0) // positive ints only
char _;

int main() {
    int n, x;
    scan(n);
    scan(x);
    n -= x;
    if (n % 2 == 1) {
        printf("-1\n");
        return 0;
    }
    if (x != 0) {
        for (int i = 0; i < n / 2; i++) {
            printf("1 0 ");
        }
        for (int i = 0; i < x - 1; i++) {
            printf("0 ");
        }
        if (x - 1 >= 0) {
            printf("0");
        }
    } else {
        for (int i = 0; i < (n + x) / 2 - 1; i++) {
            printf("1 0 ");
        }
        printf("1 0");
    }
    printf("\n");
    return 0;
}
