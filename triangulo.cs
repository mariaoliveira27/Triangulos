using System;

class Program {
    static void Main() {
        natalTree1();
        natalTree2();
        natalTree3();
    }

    static void natalTree1() {//
        Console.Write("Digite o numero de linhas (maior que 0): ");
        int tamanho = int.Parse(Console.ReadLine());
        Console.WriteLine();

        for (int i = 1; i <= tamanho; i++) {
            Console.Write(new string(' ', tamanho - i));
            Console.WriteLine(new string('*', (2 * i) - 1));
        }
    }

    static void natalTree2() {
        Console.Write("Digite o numero de linhas (maior que 0): ");
        int tamanho = int.Parse(Console.ReadLine());
        Console.WriteLine();

        for (int i = 1; i <= tamanho; i++) {
            Console.Write(new string(' ', tamanho - i));
            for (int star = 1; star <= (2 * i) - 1; star++) {
                if (star == 1 || star == (2 * i) - 1)
                    Console.Write("#");
                else
                    Console.Write("*");
            }
            Console.WriteLine();
        }
    }

    static void natalTree3() {
        Console.Write("Digite o numero de linhas (maior que 0): ");
        int tamanho = int.Parse(Console.ReadLine());
        Console.WriteLine();

        for (int i = 1; i <= tamanho; i++) {
            Console.Write(new string(' ', tamanho - i));
            Console.WriteLine(new string('*', (2 * i) - 1));
        }

        for (int i = tamanho - 1; i >= 1; i--) {
            Console.Write(new string(' ', tamanho - i));
            Console.WriteLine(new string('*', (2 * i) - 1));
        }
    }
}
