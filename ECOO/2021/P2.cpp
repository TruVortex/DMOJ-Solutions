#include <stdio.h>

int main() {
    char last = getchar(), current;
    while ((current = getchar()) != '\n') {
        printf("%c", last);
        if ((last == 'A' && current == 'A') || (last != 'A' && current != 'A')) {
            printf(" ");
        }
        last = current;
    }
    printf("%c", last);
    return 0;
}
