#include <stdio.h>
#include <algorithm>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int main() {
    int n;
    scan(n);
    int bowls[n];
    for (int i = 0; i < n; i++) {
        scan(bowls[i]);
    }
    if (n == 2) {
        if ((bowls[0] + bowls[1]) % 2) {
            printf("1");
        } else {
            printf("2");
        }
        return 0;
    }
    sort(bowls, bowls + n);
    for (int i = n - 1; i >= 2; i--) {
        for (int j = i - 1; j >= 1; j--) {
            if (binary_search(bowls, bowls + n, bowls[j] + bowls[j] - bowls[i])) {
                printf("3");
                return 0;
            }
        }
    }
    printf("2");
    return 0;
}
