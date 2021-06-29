#include <stdio.h>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

int main() {
    int n;
    scanf("%d", &n);
    n = (26 + (n % 26)) % 26;
    getchar();
    char ch = getchar();
    while (ch != '\n') {
        if ('a' <= ch && ch <= 'z') {
            ch -= n;
            if (ch < 'a') {
                ch += 26;
            }
        } else if ('A' <= ch && ch <= 'Z') {
            ch -= n;
            if (ch < 'A') {
                ch += 26;
            }
        }
        printf("%c", ch);
        ch = getchar();
    }
}
