#include <stdio.h>
#include <algorithm>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int h, blocks[10], ans = 101;

void func(int sum, int idx, int cnt) {
    if (sum > h) {
        return;
    }
    if (idx == 10) {
        if (sum == h) {
            ans = min(ans, cnt);
        }
        return;
    }
    func(sum, idx + 1, cnt);
    func(sum + blocks[idx], idx + 1, cnt + 1);
}

int main() {
    int s;
    scan(h);
    scan(s);
    for (int i = 0; i < s; i++) {
        scan(blocks[i]);
    }
    func(0, 0, 0);
    printf("%d\n", ans == 101 ? 0 : ans);
    return 0;
}
