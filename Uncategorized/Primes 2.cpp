#include <stdio.h>
#include <vector>
#include <math.h>
#include <algorithm>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

vector<bool> segmentedSieve(int n, int m) {
    int lim = sqrt(m);
    vector<bool> composite(lim + 1, false);
    vector<int> primes;
    for (int i = 2; i <= lim; i++) {
        if (!composite[i]) {
            primes.push_back(i);
            for (int j = i * i; j <= lim; j += i) {
                composite[j] = true;
            }
        }
    }
    vector<bool> isPrime(m - n + 1, true);
    for (int i : primes) {
        for (int j = max(i * i, (n + i - 1) - (n + i - 1) % i); j <= m; j += i) {
            isPrime[j - n] = false;
        }
    }
    if (n == 1) {
        isPrime[0] = false;
    }
    return isPrime;
}

int main() {
    int n, m;
    scan(n);
    scan(m);
    vector<bool> primes = segmentedSieve(n, m);
    for (int i = n; i <= m; i++) {
        if (primes[i - n]) {
            printf("%d\n", i);
        }
    }
    return 0;
}
