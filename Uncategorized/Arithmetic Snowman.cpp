#include <stdio.h>
#include <algorithm>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int main() {
    int n, sum = 0;
    scan(n);
    int snowballs[n];
    for (int i = 0; i < n; i++) {
        scan(snowballs[i]);
    }
    sort(snowballs, snowballs + n);
    for (int i = n - 1; i >= 0; i--) {
        for (int j = i - 1; j >= 0; j--) {
            int temp = snowballs[j] + snowballs[j] - snowballs[i];
            if (binary_search(snowballs, snowballs + j, temp)) {
                sum = max(sum, snowballs[lower_bound(snowballs, snowballs + j, temp) - snowballs] + snowballs[j] + snowballs[i]);
                break;
            }
        }
    }
    printf("%d", sum);
    return 0;
}
