import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int x;
        int y;
        int sum;
        int sub;
        int mult;
        int div;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de x: ");
        x = scanner.nextInt();

        System.out.print("Introduce el valor de y: ");
        y = scanner.nextInt();
        scanner.close();

        sum = x + y;
        sub = x - y;
        mult = x * y;
        div = x / y;

        System.out.println("La suma de ambos números es de: " + sum);
        System.out.println("La resta de ambos números es de: " + sub);
        System.out.println("La multiplicación de ambos números es de: " + mult);
        System.out.println("La división de ambos números es de: " + div);
    }
}
