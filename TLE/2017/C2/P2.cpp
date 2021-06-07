#include <stdio.h>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int arr[1000001];

int main() {
    int n, k;
    scan(k);
    for (int i = 0, temp; i < k; i++) {
        scan(temp);
        arr[temp]++;
    }
    for (int i = 1; i < 1000001; i++) {
        arr[i] += arr[i - 1];
    }
    scan(n);
    for (int i = 0, temp; i < n; i++) {
        scan(temp);
        printf("%d\n", temp - arr[temp]);
    }
    return 0;
}
