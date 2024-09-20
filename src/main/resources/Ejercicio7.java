import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        double precio;
        double precioRebajado;
        double descuento;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el precio real: ");
        precio = scanner.nextDouble();

        System.out.println("Introduce el precio rebajado: ");
        precioRebajado = scanner.nextDouble();
        scanner.close();

        descuento = (precio - precioRebajado) / precio * 100;
        System.out.println("El descuento aplicado es de: " + descuento + "%");
    }
}
