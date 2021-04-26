#include <stdio.h>
#include <algorithm>
#define scan(x) do{while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0');}while(0)
char _;

using namespace std;

int main() {
    int n;
    scan(n);
    for (int i = 0; i < n; i++) {
        int sides[3];
        for (int j = 0; j < 3; j++) {
            scan(sides[j]);
        }
        sort(sides, sides + 3);
        long long n1 = (long long) sides[0], n2 = (long long) sides[1], n3 = (long long) sides[2];
        long long m = n1 * n1 + n2 * n2 - n3 * n3;
        if (m < 0) {
            printf("O\n");
        } else if (m > 0) {
            printf("A\n");
        } else {
            printf("R\n");
        }
    }
    return 0;
}
