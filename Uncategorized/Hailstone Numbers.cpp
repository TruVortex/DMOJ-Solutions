#include <stdio.h>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int main() {
    int cnt = 0;
    long long n;
    scan(n);
    while (n != 1) {
        if (n % 2) {
            n = n + n + n + 1;
        } else {
            n /= 2;
        }
        cnt++;
    }
    printf("%d", cnt);
}
