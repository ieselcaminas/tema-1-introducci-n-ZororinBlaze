import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        int nota;
        int media = 0;
        int sumaNotas = 0;
        boolean hayDiez = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime tu nota: ");
        nota = scanner.nextInt();

        while (nota != -1){
            if (nota == 10){
                hayDiez = true;
            }
            sumaNotas = sumaNotas + nota;
            media++;

            System.out.println("Dime tu nota: ");
            nota = scanner.nextInt();
        }
        scanner.close();

        System.out.println("La media es de: " + (sumaNotas / media));
    }
}
