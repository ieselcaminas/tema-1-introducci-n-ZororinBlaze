import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        int a;
        int b;
        String operacion;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        a = scanner.nextInt();

        System.out.println("Introduce el segundo número: ");
        b = scanner.nextInt();

        System.out.println("Pulsa '+' para sumar, '-' para restar, '*' para multiplicar, '/' para dividir:");
        operacion = scanner.next();
        scanner.close();

        switch (operacion){
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
        }

    }
}
