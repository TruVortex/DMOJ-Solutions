#include <math.h>

bool f(int N) {
    if (N < 2) {
        return false;
    }
    for (int i = 2; i <= sqrt(N); i++) {
        if (N % i == 0) {
            return false;
        }
    }
    return true;
}
