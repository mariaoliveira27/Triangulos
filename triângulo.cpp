#include <iostream>

using namespace std;

void natalTree1() {
    int tamanho;
    cout << "Digite o numero de linhas (maior que 0): ";
    cin >> tamanho;
    cout << endl;

    for (int i = 1; i <= tamanho; i++) {
        for (int j = 1; j <= tamanho - i; j++)
            cout << " ";
        for (int star = 1; star <= (2 * i) - 1; star++)
            cout << "*";
        cout << endl;
    }
}

void natalTree2() {
    int tamanho;
    cout << "Digite o numero de linhas (maior que 0): ";
    cin >> tamanho;
    cout << endl;

    for (int i = 1; i <= tamanho; i++) {
        for (int j = 1; j <= tamanho - i; j++)
            cout << " ";
        for (int star = 1; star <= (2 * i) - 1; star++) {
            if (star == 1 || star == (2 * i) - 1)
                cout << "#";
            else
                cout << "*";
        }
        cout << endl;
    }
}

void natalTree3() {
    int tamanho;
    cout << "Digite o numero de linhas (maior que 0): ";
    cin >> tamanho;
    cout << endl;

    for (int i = 1; i <= tamanho; i++) {
        for (int j = 1; j <= tamanho - i; j++)
            cout << " ";
        for (int star = 1; star <= (2 * i) - 1; star++)
            cout << "*";
        cout << endl;
    }

    for (int i = tamanho - 1; i >= 1; i--) {
        for (int j = 1; j <= tamanho - i; j++)
            cout << " ";
        for (int star = 1; star <= (2 * i) - 1; star++)
            cout << "*";
        cout << endl;
    }
}

int main() {
    natalTree1();
    natalTree2();
    natalTree3();
    return 0;
}
