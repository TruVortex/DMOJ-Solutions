#include <stdio.h>
#include <vector>
#include <math.h>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

struct Point {
    int x, y;

    Point(int xx, int yy) {
        x = xx;
        y = yy;
    }
};

int main() {
    int n, ans = 0;
    scan(n);
    vector<Point> points;
    for (int i = 0; i < n; i++) {
        int x, y;
        scan(x);
        scan(y);
        points.push_back(Point(x, y));
    }
    for (int i = 0; i < n - 1; i++) {
        ans += points[i].x * points[i + 1].y - points[i + 1].x * points[i].y;
    }
    printf("%d", (int) ceil(abs(ans + points[n - 1].x * points[0].y - points[0].x * points[n - 1].y) / 2.0));
    return 0;
}
