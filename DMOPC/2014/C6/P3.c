#include <stdio.h>
#include <stdlib.h>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

int main() {
    int n, temp = 1, temp1, temp2, cur = 1;
    scan(n);
    scanf("%d", &temp1);
    for (int i = 1; i < n; i++) {
        scanf("%d", &temp2);
        if (abs(temp2 - temp1) <= 2) {
            cur++;
        } else {
            temp = temp > cur ? temp : cur;
            cur = 1;
        }
        temp1 = temp2;
    }
    temp = temp > cur ? temp : cur;
    printf("%d", temp);
    return 0;
}
