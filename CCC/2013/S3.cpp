#include <stdio.h>
#include <string>
#include <algorithm>
#define scan(x) do{while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0');}while(0)
char _;

using namespace std;

int team, ans = 0, teamPermutations[6][2] = { {0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}, {2, 3} };

bool check(string games) {
    int teamScores[4] = {};
    for (int i = 0; i < 6; i++) {
        if (games[i] == 'W') {
            teamScores[teamPermutations[i][0]] += 3;
        } else if (games[i] == 'L') {
            teamScores[teamPermutations[i][1]] += 3;
        } else {
            teamScores[teamPermutations[i][0]]++;
            teamScores[teamPermutations[i][1]]++;
        }
    }
    int maxScore = *max_element(teamScores, teamScores + 4);
    if (teamScores[team] == maxScore) {
        int cnt = 0;
        for (int score : teamScores) {
            if (score == maxScore) {
                cnt++;
            }
        }
        if (cnt == 1) {
            return true;
        }
    }
    return false;
}

void checkAgain(string games, int played) {
    if (played == 6) {
        if (check(games)) {
            ans++;
        }
        return;
    }
    played++;
    int idx = games.find(".");
    string start = games.substr(0, idx);
    string end = games.substr(idx + 1, games.length() - idx);
    checkAgain(start + 'W' + end, played);
    checkAgain(start + 'L' + end, played);
    checkAgain(start + 'T' + end, played);
}

int main() {
    int g;
    scan(team);
    scan(g);
    team--;
    string games = "......";
    for (int i = 0; i < g; i++) {
        int a, b, sa, sb;
        scan(a);
        scan(b);
        scan(sa);
        scan(sb);
        a--;
        b--;
        char outcome = '.';
        if (sa > sb) {
            outcome = 'W';
        } else if (sa < sb) {
            outcome = 'L';
        } else {
            outcome = 'T';
        }
        for (int j = 0; j < 6; j++) {
            if (a == teamPermutations[j][0] && b == teamPermutations[j][1]) {
                games = games.substr(0, j) + outcome + games.substr(j + 1, games.length() - j);
                break;
            }
        }
    }
    checkAgain(games, g);
    printf("%d", ans);
    return 0;
}
