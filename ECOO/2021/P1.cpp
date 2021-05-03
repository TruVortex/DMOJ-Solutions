#include <stdio.h>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

int main() {
    int time, interval, message;
    scan(time);
    scan(interval);
    scan(message);
    for (int i = 0; i < 3; i++) {
        time += interval;
        if (time >= message) {
            printf("%d", time);
            return 0;
        }
    }
    printf("Who knows...");
    return 0;
}
