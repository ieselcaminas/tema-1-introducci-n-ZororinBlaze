import java.util.Random;
import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Random aleatorio = new Random(System.currentTimeMillis());
        int secreto = aleatorio.nextInt(100);

        int numJugador;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivina el número: ");
        numJugador = scanner.nextInt();

        if (secreto == numJugador) {
            scanner.close();
            System.out.println("LO HAS ADIVINADO A LA PRIMERA, QUE MÁQUINA");
        } else{
            while(numJugador != -1){
                System.out.println("Adivina el número: ");
                numJugador = scanner.nextInt();
                if (secreto == numJugador){
                    scanner.close();
                    System.out.println("Lo has adivinado :D");
                    break;
                }
            }
            if (numJugador == -1){
                System.out.println("Te has rendido.");
            }
        }

    }
}
