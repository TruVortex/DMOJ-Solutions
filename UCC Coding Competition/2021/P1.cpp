#include <stdio.h>

int main() {
    int ans = 0;
    char ch = getchar();
    while (ch != '\n') {
        if (ch == '2') {
            ans++;
        } else if (ch == '5') {
            ans--;
        }
        ch = getchar();
    }
    printf("%d", ans);
    return 0;
}
