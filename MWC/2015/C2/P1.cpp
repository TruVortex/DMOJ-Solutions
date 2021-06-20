// this feels way more complicated than it should have been
#include <iostream>
#include <string>
#include <stack>
#include <vector>

using namespace std;

int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    string str;
    cin >> str;
    int speed = str.length() * str.length();
    char temp[speed + 1];
    for (int i = 0; i < str.length(); i++) {
        for (int j = 0; j <= i; j++) {
            temp[j + i * (i + 1) / 2] = str[i];
            temp[speed - j - i * (i + 1) / 2 - 1] = str[i];
        }
    }
    temp[speed] = '\0';
    stack<vector<char>> before;
    for (int i = 0; i < (speed + 1) / 2; i++) {
        temp[i] = str[0];
        temp[speed - i - 1] = str[0];
        vector<char> temp1;
        for (char ch : temp) {
            temp1.push_back(ch);
        }
        before.push(temp1);
        printf("%s\n", temp);
    }
    before.pop();
    for (int i = 0; i < speed / 2; i++) {
        for (int j = 0; j < speed; j++) {
            printf("%c", before.top()[j]);
        }
        printf("\n");
        before.pop();
    }
}
