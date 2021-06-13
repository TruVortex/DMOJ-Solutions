#include <stdio.h>
#include <utility>
#include <math.h>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int dolls[101];

int main() {
    pair<int, int> max(0, 0), min(0, 1000001);
    int n;
    scan(n);
    for (int i = 0, temp; i < n; i++) {
        scan(temp);
        dolls[temp]++;
    }
    for (int i = 1; i < 101; i++) {
        if (dolls[i] >= max.second) {
            max = { i, dolls[i] };
        }
        if (dolls[i] && dolls[i] < min.second) {
            min = { i, dolls[i] };
        }
    }
    printf("%d", abs(max.first - min.first));
}
