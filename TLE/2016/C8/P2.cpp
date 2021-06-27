#include <stdio.h>
#include <string>
#include <bitset>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int main() {
    int t;
    scan(t);
    for (int i = 0; i < t; i++) {
        int n;
        scan(n);
        string str = bitset<30>(n).to_string();
        str.erase(0, min(str.find_first_not_of('0'), str.length() - 1));
        for (char ch : str) {
            if (ch == '1') {
                printf("dank ");
            } else {
                printf("meme ");
            }
        }
        printf("\n");
    }
}
