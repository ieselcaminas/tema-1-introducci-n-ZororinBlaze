import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        double radio;
        double area;
        double perimetro;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el radio: ");
        radio = scanner.nextDouble();
        scanner.close();

        area = Math.PI * radio * radio;
        perimetro = 2 * Math.PI * radio;

        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El area es: " + area);
    }
}
