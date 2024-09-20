import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        String palabra;
        String palabraInvertida = "";
        boolean palindroma = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una palabra o frase y te diré si es palíndroma: ");
        palabra = scanner.nextLine();
        scanner.close();

        for (int i = palabra.length() - 1; i >= 0; i--){ //Bucle para invertir la palabra
            palabraInvertida = palabraInvertida + palabra.charAt(i);
        }

        if (palabraInvertida.equals(palabra)){
            System.out.println("Es palíndroma.");
        }else{
            System.out.println("No es palíndroma.");
        }
    }
}
