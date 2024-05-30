def natalTree1():
    tamanho = int(input("Digite o numero de linhas (maior que 0): "))
    print()

    for i in range(1, tamanho + 1):
        print(" " * (tamanho - i) + "*" * (2 * i - 1))


def natalTree2():
    tamanho = int(input("Digite o numero de linhas (maior que 0): "))
    print()

    for i in range(1, tamanho + 1):
        line = " " * (tamanho - i)
        for star in range(1, 2 * i):
            if star == 1 or star == 2 * i - 1:
                line += "#"
            else:
                line += "*"
        print(line)


def natalTree3():
    tamanho = int(input("Digite o numero de linhas (maior que 0): "))
    print()

    for i in range(1, tamanho + 1):
        print(" " * (tamanho - i) + "*" * (2 * i - 1))

    for i in range(tamanho - 1, 0, -1):
        print(" " * (tamanho - i) + "*" * (2 * i - 1))


def main():
    natalTree1()
    natalTree2()
    natalTree3()


if __name__ == "__main__":
    main()
