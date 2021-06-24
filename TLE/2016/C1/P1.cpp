#include <stdio.h>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

int main() {
    int d, dn1 = 0, dn2 = 1000001, q, qn1 = 1000001, qn2 = 0;
    scan(d);
    for (int i = 0, temp; i < d; i++) {
        scan(temp);
        if (temp > dn1) {
            dn1 = temp;
        }
        if (temp < dn2) {
            dn2 = temp;
        }
    }
    scan(q);
    for (int i = 0, temp; i < q; i++) {
        scan(temp);
        if (temp < qn1) {
            qn1 = temp;
        }
        if (temp > qn2) {
            qn2 = temp;
        }
    }
    if (10.0 / dn1 > 25.0 / qn1) {
        printf("Dimes are better");
    } else if (10.0 / dn2 < 25.0 / qn2) {
        printf("Quarters are better");
    } else {
        printf("Neither coin is better");
    }
}
