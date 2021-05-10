#include <stdio.h>
#define scan(x) do{while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0');}while(0)
char _;

int main() {
    int n;
    scan(n);
    int l = 1, r = n;
    while (l <= r) {
        printf("%d ", l);
        l++;
        if (l > r) {
            break;
        }
        printf("%d ", r);
        r--;
    }
    return 0;
}
