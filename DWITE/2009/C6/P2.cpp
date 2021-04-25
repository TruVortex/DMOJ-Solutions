#include <stdio.h>
#include <algorithm>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int main() {
    for (int cases = 0; cases < 5; cases++) {
        int n, minn = 0;
        scan(n);
        for (int i = 15; i >= 0; i--) {
            int temp = 1 << i;
            if (temp < n) {
                minn = 1 << (i + 1);
                minn = (min(minn - n, n - temp) == (minn - n)) ? minn : temp;
                break;
            }
        }
        printf("%d\n", minn);
    }
    return 0;
}
