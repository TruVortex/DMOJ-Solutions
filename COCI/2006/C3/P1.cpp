#include <stdio.h>
#define scan(x) do{while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0');}while(0) // positive ints only
char _;

using namespace std;

int main() {
    int dwarves[9], sum = 0;
    for (int i = 0; i < 9; i++) {
        scan(dwarves[i]);
        sum += dwarves[i];
    }
    for (int i = 0; i < 9; i++) {
        for (int j = i + 1; j < 9; j++) {
            if (sum - dwarves[i] - dwarves[j] == 100) {
                for (int k = 0; k < 9; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    printf("%d\n", dwarves[k]);
                }
                return 0;
            }
        }
    }
    return 0;
}
