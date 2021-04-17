#include <stdio.h>
#define scan(x) do{while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0');}while(0) // positive ints only
char _;

int main() {
    int s, r;
    scan(s);
    scan(r);
    s *= s;
    double temp = 3.14 * r * r;
    printf("%s", s > temp ? "SQUARE" : "CIRCLE");
    return 0;
}
