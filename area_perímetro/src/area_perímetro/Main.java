package area_perímetro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação:");
        System.out.println("1 - Calcular Área");
        System.out.println("2 - Calcular Perímetro");
        int operacao = scanner.nextInt();

        if (operacao != 1 && operacao != 2) {
            System.out.println("Opção inválida. Encerrando o programa.");
            return;
        }

        System.out.println("Escolha a figura geométrica:");
        System.out.println("1 - Círculo");
        System.out.println("2 - Quadrado");
        System.out.println("3 - Retângulo");
        System.out.println("4 - Triângulo");
        int figura = scanner.nextInt();

        switch (figura) {
            case 1:
                if (operacao == 1) {
                    System.out.println("Digite o raio do círculo:");
                    double raio = scanner.nextDouble();
                    Circulo circulo = new Circulo(raio);
                    System.out.println("Área do círculo: " + circulo.calcularArea());
                } else {
                    System.out.println("Digite o raio do círculo:");
                    double raio = scanner.nextDouble();
                    Circulo circulo = new Circulo(raio);
                    System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
                }
                break;

            case 2:
                if (operacao == 1) {
                    System.out.println("Digite o lado do quadrado:");
                    double lado = scanner.nextDouble();
                    Quadrado quadrado = new Quadrado(lado);
                    System.out.println("Área do quadrado: " + quadrado.calcularArea());
                } else {
                    System.out.println("Digite o lado do quadrado:");
                    double lado = scanner.nextDouble();
                    Quadrado quadrado = new Quadrado(lado);
                    System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
                }
                break;

            case 3:
                if (operacao == 1) {
                    System.out.println("Digite a base do retângulo:");
                    double base = scanner.nextDouble();
                    System.out.println("Digite a altura do retângulo:");
                    double altura = scanner.nextDouble();
                    Retangulo retangulo = new Retangulo(base, altura);
                    System.out.println("Área do retângulo: " + retangulo.calcularArea());
                } else {
                    System.out.println("Digite a base do retângulo:");
                    double base = scanner.nextDouble();
                    System.out.println("Digite a altura do retângulo:");
                    double altura = scanner.nextDouble();
                    Retangulo retangulo = new Retangulo(base, altura);
                    System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
                }
                break;

            case 4:
                if (operacao == 1) {
                    System.out.println("Digite o lado 1 do triângulo:");
                    double lado1 = scanner.nextDouble();
                    System.out.println("Digite o lado 2 do triângulo:");
                    double lado2 = scanner.nextDouble();
                    System.out.println("Digite o lado 3 do triângulo:");
                    double lado3 = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
                    System.out.println("Área do triângulo: " + triangulo.calcularArea());
                } else {
                    System.out.println("Digite o lado 1 do triângulo:");
                    double lado1 = scanner.nextDouble();
                    System.out.println("Digite o lado 2 do triângulo:");
                    double lado2 = scanner.nextDouble();
                    System.out.println("Digite o lado 3 do triângulo:");
                    double lado3 = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
                    System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());
                }
                break;

            default:
                System.out.println("Opção inválida. Encerrando o programa.");
        }

        scanner.close();
    }
}