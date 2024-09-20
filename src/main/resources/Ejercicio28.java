import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        int num;
        boolean primo = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un número: ");
        num = scanner.nextInt();
        scanner.close();

        if (num <= 1){//Si el número es menor o igual que uno no puede ser primo
            primo = false;
        }else if (num == 2) { //El número dos es el único par primo
            primo = true;
        } else if (num % 2 == 0) {//El resto de números pares no son primos
            primo = false;
        } else if (num % 2 != 0){ //Los números impares...
            for (int i = 3; i <= (num / 2); i += 2){//Bucle que empieza por el impar 3 y va de dos en dos entre impares hasta llegar a la mitad del número del usuario
                if (num % i == 0){ //Si el resto da 0 no puede ser primo, ya que sólo puede ser divisible por 1 y por sí mismo
                    primo = false;
                    break;//Cerramos el bucle ya que si el resto da 0, puede ser divisible por más de dos números y no sería primo
                }
            }
        }

        if (primo){
            System.out.println("El número es primo.");
        }else{
            System.out.println("El número no es primo.");
        }
    }
}
