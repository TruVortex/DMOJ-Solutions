#include <stdio.h>
#include <algorithm>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int main() {
    int n;
    scan(n);
    int last[n];
    for (int i = 0; i < n; i++) {
        int temp[n];
        for (int j = 0; j < n; j++) {
            scan(temp[j]);
        }
        sort(temp, temp + n);
        last[i] = temp[n / 2];
    }
    sort(last, last + n);
    printf("%d\n", last[n / 2]);
    return 0;
}
