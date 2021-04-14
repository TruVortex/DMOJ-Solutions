#include <stdio.h>

int main() {
    int n, k, rows[100001] = {}, cols[100001] = {}, leftDiag[200003] = {}, rightDiag[200003] = {};
    scanf("%d%d", &n, &k);
    for (int i = 1; i <= n; i++) {
        int x, y;
        scanf("%d%d", &x, &y);
        rows[y]++;
        cols[x]++;
        leftDiag[x + y]++;
        rightDiag[x - y + 100000]++;
        if (rows[y] == k || cols[x] == k || leftDiag[x + y] == k || rightDiag[x - y + 100000] == k) {
            printf("%d", i);
            return 0;
        }
    }
    return 0;
}
