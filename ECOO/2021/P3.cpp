#include <stdio.h>
#include <cstring>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

int main() {
    int n, m, k;
    scan(n);
    scan(m);
    scan(k);
    int questions[n][2];
    memset(questions, -1, sizeof(questions));
    for (int i = 0; i < k; i++) {
        int a, b, c;
        scan(a);
        scan(b);
        scan(c);
        b--;
        if (c > questions[b][1]) {
            questions[b][0] = a;
            questions[b][1] = c;
        }
    }
    for (int i = 0; i < n; i++) {
        printf("%d ", questions[i][0]);
    }
    return 0;
}
