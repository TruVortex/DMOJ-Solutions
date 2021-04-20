#include <stdio.h>
#include <math.h>
#define scan(x) do{while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0');}while(0) // positive ints only
char _;

int main() {
    int n;
    scan(n);
    for (int i = 0; i < n; i++) {
        int a, b = 0, c = 0, round = 0;
        scan(a);
        while (a != 1 || b != 1) {
            printf("Round %d: %d undefeated, %d one-loss, %d eliminated\n", round, a, b, c);
            c += b / 2;
            b = a / 2 + ceil(b / 2.0);
            a = ceil(a / 2.0);
            round++;
        }
        printf("Round %d: %d undefeated, %d one-loss, %d eliminated\n", round, a, b, c);
        printf("Round %d: %d undefeated, %d one-loss, %d eliminated\n", round + 1, a - 1, b + 1, c);
        printf("Round %d: %d undefeated, %d one-loss, %d eliminated\n", round + 2, a - 1, b, c + 1);
        printf("There are %d rounds.\n", round + 2);
    }
    return 0;
}
