import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        int horas;
        int minutos;
        int segundos;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime la hora: ");
        horas = scanner.nextInt();
        System.out.println("Dime los minutos: ");
        minutos = scanner.nextInt();
        System.out.println("Dime los segundos: ");
        segundos = scanner.nextInt();
        scanner.close();

        segundos++;

        if (segundos > 59){
            segundos = 0;
            minutos++;
            if (minutos > 59){
                minutos = 0;
                horas++;
            }
        }

        System.out.println("Son las: " + horas + " " + minutos + " " + segundos);
    }
}
