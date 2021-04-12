#include <stdio.h>
#include <cmath>

using namespace std;

int main() {
    int p, c, v;
    scanf("%d%d%d", &p, &c, &v);
    printf("%d", (int) (ceil(p / 3.0) + ceil(c / 3.0) + ceil(v / 3.0)));
    return 0;
}
