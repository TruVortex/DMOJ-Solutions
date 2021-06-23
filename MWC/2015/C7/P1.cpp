#include <stdio.h>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

int main() {
    int n, temp1, temp2;
    scan(n);
    scanf("%d%d", &temp1, &temp2);
    if (!temp1 && !temp2) {
        printf("both");
        return 0;
    }
    int a = temp2 - temp1, aB = 1, gB = 1;
    double g = 1.0 * temp2 / temp1;
    for (int i = 2; i < n; i++) {
        temp1 = temp2;
        scanf("%d", &temp2);
        if ((temp2 - temp1) != a) {
            aB = 0;
        }
        if ((1.0 * temp2 / temp1) != g) {
            gB = 0;
        }
        if (!aB && !gB) {
            printf("random");
            return 0;
        }
    }
    if (aB && gB) {
        printf("both");
    } else if (aB) {
        printf("arithmetic");
    } else {
        printf("geometric");
    }
}
