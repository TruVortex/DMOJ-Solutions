#include <iostream>
#include <algorithm>
#include <cctype>
#include <string>
#include <unordered_map>

using namespace std;

int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    for (int i = 0; i < 10; i++) {
        int n;
        cin >> n;
        unordered_map<string, int> emails;
        for (int j = 0; j < n; j++) {
            string email;
            cin >> email;
            transform(email.begin(), email.end(), email.begin(), [](unsigned char c) { return std::tolower(c); });
            string email1 = email.substr(0, email.find('@')), email2 = email.substr(email.find('@') + 1, email.length());
            email1.erase(std::remove_if(email1.begin(), email1.end(), [](char c) { return c == '.'; }), email1.end());
            email1 = email1.substr(0, email1.find('+'));
            email1 += email2;
            emails[email1]++;
        }
        printf("%d\n", emails.size());
    }
}
