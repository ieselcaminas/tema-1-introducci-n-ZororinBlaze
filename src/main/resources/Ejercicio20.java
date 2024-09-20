import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        double precio;
        double precioFinal;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el precio del producto: ");
        precio = scanner.nextDouble();
        scanner.close();

        if (precio < 6){
            System.out.println("No hay descuento, se mantiene el precio de " + precio);
        }else if(precio >= 6 && precio < 60){
            precioFinal = precio - (precio * 0.05);
            System.out.println("Se ha aplicado un descuento del 5%. El precio es de " + precioFinal);
        }else if(precio >= 60){
            precioFinal = precio - (precio * 0.10);
            System.out.println("Se ha aplicado un descuento del 10%. El precio es de " + precioFinal);
        }
    }
}
