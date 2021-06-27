#include <iostream>
#include <string>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    string templatee;
    int pages;
    cin >> templatee >> pages;
    for (int i = 0; i < pages; i++) {
        string page;
        cin >> page;
        for (char ch : templatee) {
            if (page.find(ch) == string::npos) {
                printf("no\n");
                goto end;
            }
        }
        printf("yes\n");
        end:;
    }
}
