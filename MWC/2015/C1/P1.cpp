#include <stdio.h>
#include <algorithm>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int main() {
    int n, ans = 0;
    scan(n);
    int songs[n];
    for (int i = 0, m, s; i < n; i++) {
        scan(m);
        scan(s);
        songs[i] = m * 60 + s;
    }
    sort(songs, songs + n);
    int temp1, temp2;
    scan(temp1);
    scan(temp2);
    temp1 = 60 * temp1 + temp2;
    for (int song : songs) {
        if (song <= temp1) {
            temp1 -= song;
            ans++;
        }
    }
    printf("%d", ans);
}
