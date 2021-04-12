#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string>
#include <unordered_set>

using namespace std;

int main() {
    int n, m, cnt = 0;
    scanf("%d%d", &n, &m);
    int coords[m][2], board[n + 1][n + 1] = {};
    for (int i = 0; i < m; i++) {
        scanf("%d%d", &coords[i][0], &coords[i][1]);
    }
    for (int i = 0; i < m; i++) {
        for (int j = 1; j <= n; j++) {
            for (int k = 1; k <= n; k++) {
                if (abs(j - coords[i][0]) == abs(k - coords[i][1]) || j == coords[i][0] || k == coords[i][1]) {
                    if (!board[j][k]) {
                        cnt++;
                        board[j][k] = true;
                    }
                }
            }
        }
    }
    printf("%d", n * n - cnt);
    return 0;
}
