import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        int precioPorHora;
        int horas;
        double salarioBruto;
        double impuestos;
        double salarioNeto;
        double ingresosGratuitos = 500;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime las horas que has trabajado: ");
        horas = scanner.nextInt();
        System.out.println("A cuánto te pagan la hora?: ");
        precioPorHora = scanner.nextInt();
        scanner.close();

        if (horas <= 35) {
            salarioBruto = precioPorHora * horas;
        } else {
            salarioBruto = (35 * precioPorHora) + ((horas - 35) * precioPorHora * 1.5);
        }

        if (salarioBruto <= ingresosGratuitos) {
            impuestos = 0;
        } else if (salarioBruto <= ingresosGratuitos + 400) {
            impuestos = (salarioBruto - ingresosGratuitos) * 0.25;
        } else {
            impuestos = (400 * 0.25) + ((salarioBruto - (ingresosGratuitos + 400)) * 0.45);
        }

        salarioNeto = salarioBruto - impuestos;

        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Salario neto: " + salarioNeto);
        System.out.println("Has pagado: " + impuestos + " en impuestos.");
    }
}
