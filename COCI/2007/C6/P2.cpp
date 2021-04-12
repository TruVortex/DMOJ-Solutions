#include <stdio.h>

int main() {
    int n, s, x = 0, t = 0;
    scanf("%d%d", &n, &s);
    for (int i = 0; i < n; ++i) {
        int l, c, z;
        scanf("%d%d%d", &l, &c, &z);
        t += l - x;
        x = l;
        while (t % (c + z) < c) {
            t++;
        }
    }
    printf("%d", t + s - x);
    return 0;
}
