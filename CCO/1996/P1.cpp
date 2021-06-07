#include <stdio.h>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

void sort(int trains[], int length) {
    int j, temp, ans = 0;
    for (int i = length - 1; i >= 0; i--) {
        j = i + 1;
        while (j < length && trains[j - 1] > trains[j]) {
            temp = trains[j - 1];
            trains[j - 1] = trains[j];
            trains[j] = temp;
            j++;
            ans++;
        }
    }
    printf("Optimal train swapping takes %d swaps.\n", ans);
}

int main() {
    int n;
    scan(n);
    for (int i = 0; i < n; i++) {
        int l;
        scan(l);
        int trains[l];
        for (int j = 0; j < l; j++) {
            scan(trains[j]);
        }
        sort(trains, l);
    }
    return 0;
}
