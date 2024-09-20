import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        int x;
        int y;
        int orden;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de x: ");
        x = scanner.nextInt();
        System.out.print("Introduce el valor de y: ");
        y = scanner.nextInt();
        System.out.println("Escribe 1 para orden ascendente y cualquier otro para orden descendente.");
        orden = scanner.nextInt();
        scanner.close();

        if (orden == 1) {
            if (x > y){
                System.out.println(y + " > " + x);
            }else{
                System.out.println(x + " > " + y);
            }
        }else{
            if (x > y){
                System.out.println(x + " > " + y);
            }else{
                System.out.println(y + " > " + x);
            }
        }
    }
}
