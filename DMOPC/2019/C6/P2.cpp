#include <stdio.h>
#include <math.h>
#include <vector>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int main() {
    int a, b, ans = 1000001;
    scan(a);
    scan(b);
    int cnt[a] = {};
    vector<int> factors;
    for (int i = 2; i <= sqrt(a); i++) {
        if (a % i == 0) {
            factors.push_back(i);
            while (a % i == 0) {
                a /= i;
                cnt[i]++;
            }
        }
    }
    if (a != 1) {
        factors.push_back(a);
        cnt[a] = 1;
    }
    for (int factor : factors) {
        int occurences = 0;
        long long n = factor;
        while (b / n != 0) {
            occurences += b / n;
            n *= factor;
        }
        ans = min(ans, occurences / cnt[factor]);
    }
    printf("%d", ans);
    return 0;
}
