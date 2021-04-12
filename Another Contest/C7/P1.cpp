#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        int user;
        scanf("%d", &user);
        if (user == 2) {
            printf("2\n");
        } else {
            printf("%d\n", user - 1);
        }
    }
    return 0;
}
