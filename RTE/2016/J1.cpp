#include <stdio.h>

using namespace std;

int main() {
    int cnt1 = 0, cnt2 = 0, cur = 0;
    char ch = getchar();
    while (ch != '\n') {
        if (ch == 'L') {
            cnt1++;
            cur++;
        } else if (ch != ' ') {
            if (cur > cnt2) {
                cnt2 = cur;
            }
            cur = 0;
        }
        ch = getchar();
    }
    if (cur > cnt2) {
        cnt2 = cur;
    }
    printf("%d %d", cnt1, cnt2);
}
