import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        natalTree1();
        natalTree2();
        natalTree3();
    }

    public static void natalTree1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero de linhas (maior que 0): ");
        int tamanho = scanner.nextInt();
        System.out.println();

        for (int i = 1; i <= tamanho; i++) {
            for (int j = 1; j <= tamanho - i; j++)
                System.out.print(" ");
            for (int star = 1; star <= (2 * i) - 1; star++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void natalTree2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero de linhas (maior que 0): ");
        int tamanho = scanner.nextInt();
        System.out.println();

        for (int i = 1; i <= tamanho; i++) {
            for (int j = 1; j <= tamanho - i; j++)
                System.out.print(" ");
            for (int star = 1; star <= (2 * i) - 1; star++) {
                if (star == 1 || star == (2 * i) - 1)
                    System.out.print("#");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void natalTree3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero de linhas (maior que 0): ");
        int tamanho = scanner.nextInt();
        System.out.println();

        for (int i = 1; i <= tamanho; i++) {
            for (int j = 1; j <= tamanho - i; j++)
                System.out.print(" ");
            for (int star = 1; star <= (2 * i) - 1; star++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = tamanho - 1; i >= 1; i--) {
            for (int j = 1; j <= tamanho - i; j++)
                System.out.print(" ");
            for (int star = 1; star <= (2 * i) - 1; star++)
                System.out.print("*");
            System.out.println();
        }
    }
}
