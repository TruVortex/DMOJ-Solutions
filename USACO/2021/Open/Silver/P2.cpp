#include <unordered_set>
#include <algorithm>
#include <stdio.h>
#define scan(x) while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0')
char _;

using namespace std;

int main() {
    int t;
    scan(t);
    for (int i = 0; i < t; i++) {
        int n, ans = 0;
        scan(n);
        int nums[n];
        unordered_set<int> numCombs;
        for (int j = 0; j < n; j++) {
            scan(nums[j]);
        }
        for (int n1 : nums) {
            numCombs.insert(n1);
            for (int n2 : nums) {
                if (n1 < n2) {
                    numCombs.insert(n2 - n1);
                }
            }
        }
        for (int a : numCombs) {
            for (int b : numCombs) {
                for (int c : numCombs) {
                    if (a <= b && b <= c) {
                        int arr[7] = { a, b, c, a + b, a + c, b + c, a + b + c };
                        bool flag = false;
                        for (int num : nums) {
                            if (find(begin(arr), end(arr), num) == end(arr)) {
                                flag = true;
                                break;
                            }
                        }
                        if (!flag) {
                            ans++;
                        }
                    }
                }
            }
        }
        printf("%d\n", ans);
    }
    return 0;
}
