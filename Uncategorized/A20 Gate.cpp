#include <stdio.h>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

int main() {
    int n;
    scan(n);
    for (int i = 0; i < n; i++) {
        unsigned int temp;
        scanf("%X", &temp);
        if (temp & (1 << 20)) {
            printf("%08X %08X\n", temp ^ (1 << 20), temp);
        } else {
            printf("%08X\n", temp);
        }
    }
}
