#include <iostream>
#include <bits/stdc++.h>
using namespace std;

class Student
{
private:
    string name;
    int reg;

public:
    Student(string name, int reg)
    {
        this->name = name;
        this->reg = reg;
    }

    void display()
    {
        cout << this->name << endl;
        cout << this->reg << endl;
    }
};

int main()
{
    int choice;
    cin >> choice;
    int reg;
    string name;
    cin >> name;
    if (choice == 1)
    {
        cin >> reg;
        Student s1(name, reg);
        s1.display();
    }
    else if (choice == 2)
    {
        Student s1(name, reg);
        s1.display();
    }
    else
    {
        cout << "Wrong Choice" << endl;
    }
    return 0;
}