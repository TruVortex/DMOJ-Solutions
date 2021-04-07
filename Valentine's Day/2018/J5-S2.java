import sys
from itertools import chain, combinations

input = sys.stdin.readline


def powerset(arr):
    arr = list(arr)
    return chain.from_iterable(combinations(arr, r) for r in range(len(arr) + 1))


n, m = map(int, input().split())
costs = []
deals = []

for i in range(n):
    costs.append(int(input()))

for i in range(m):
    deals.append(list(map(int, input().split())))

wanted = list(map(int, input().split()))
combs = [list(filter(None, arr)) for arr in powerset(range(1, m + 1))]
ans = 1000000000

for comb in combs:
    have_currently = [0] * n
    cost = 0
    for i in comb:
        cost += deals[i - 1][0]
        for j in range(1, n + 1):
            have_currently[j - 1] += deals[i - 1][j]
    flag = True
    for i in range(n):
        if have_currently[i] > wanted[i]:
            flag = False
            break
        cost += (wanted[i] - have_currently[i]) * costs[i]
    if flag:
        ans = min(ans, cost)

print(ans)
