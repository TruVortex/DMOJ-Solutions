#include <stdio.h>
#include <unordered_set>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

char letters[36] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

int main() {
    int n;
    scan(n);
    char square[n][n];
    for (int i = 0; i < n; i++) {
        unordered_set<int> row;
        for (int j = 0; j < n; j++) {
            square[i][j] = getchar();
            if (row.find(square[i][j]) != row.end()) {
                printf("No\n");
                return 0;
            }
            row.insert(square[i][j]);
        }
        getchar();
    }
    for (int i = 0; i < n; i++) {
        unordered_set<int> col;
        for (int j = 0; j < n; j++) {
            if (col.find(square[j][i]) != col.end()) {
                printf("No\n");
                return 0;
            }
            col.insert(square[j][i]);
        }
    }
    bool reduced = true;
    for (int i = 0; i < n; i++) {
        if (square[0][i] != letters[i] || square[i][0] != letters[i]) {
            reduced = false;
            break;
        }
    }
    printf("%s\n", reduced ? "Reduced" : "Latin");
    return 0;
}
