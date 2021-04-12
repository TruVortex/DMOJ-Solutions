#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
    for (int cases = 0; cases < 10; cases++) {
        int n, m, d;
        scanf("%d%d%d", &n, &m, &d);
        int clean = n, dirty = 0, day = 0, cnt = 0;
        int events[d] = {};
        for (int i = 0; i < m; i++) {
            int temp;
            scanf("%d", &temp);
            events[temp - 1]++;
        }
        while (day != d) {
            if (clean != 0) {
                clean--;
                dirty++;
            } else {
                clean = dirty - 1;
                dirty = 1;
                cnt++;
            }
            clean += events[day];
            day++;
        }
        printf("%d\n", cnt);
    }
    return 0;
}
