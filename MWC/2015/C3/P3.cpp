#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

constexpr int MAXN = 25;

int n, dx[8] = { -1, 1, 0, 0, -1, -1, 1, 1 }, dy[8] = { 0, 0, -1, 1, -1, 1, -1, 1 };

bool exists(char board[MAXN][MAXN], string word, int x, int y) {
    if (board[x][y] != word[0]) {
        return false;
    } else if (word.length() == 1) {
        return true;
    }
    char letter = board[x][y];
    board[x][y] = '.';
    for (int i = 0; i < 8; i++) {
        x += dx[i];
        y += dy[i];
        if (0 <= x && x <= n - 1 && 0 <= y && y <= n - 1 && exists(board, word.substr(1, word.length() - 1), x, y)) {
            return true;
        }
        x -= dx[i];
        y -= dy[i];
    }
    board[x][y] = letter;
    return false;
}

int check(char board[MAXN][MAXN], string word) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (exists(board, word, i, j)) {
                return true;
            }
        }
    }
    return false;
}

int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    char board[MAXN][MAXN];
    int q;
    cin >> n >> q;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> board[i][j];
        }
    }
    for (int i = 0; i < q; i++) {
        char tempBoard[MAXN][MAXN];
        for (int j = 0; j < n; j++) {
            copy(board[j], board[j] + n, tempBoard[j]);
        }
        string str;
        cin >> str;
        if (check(tempBoard, str)) {
            printf("good puzzle!\n");
        } else {
            printf("bad puzzle!\n");
        }
    }
    return 0;
}
