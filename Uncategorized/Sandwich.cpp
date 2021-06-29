#include <stdio.h>
#include <deque>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int main() {
    int n;
    scan(n);
    deque<int> sandwich;
    for (int i = 1; i <= n; i++) {
        if (getchar() == '0') {
            sandwich.push_back(i);
        } else {
            sandwich.push_front(i);
        }
    }
    for (int layer : sandwich) {
        printf("%d\n", layer);
    }
}
