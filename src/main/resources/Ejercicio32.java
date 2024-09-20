public class Ejercicio32 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        String cadenaNum = n1 + ", " + n2;

        for (int i = 3; i <= 40; i++){
            int t = n1 + n2;
            cadenaNum = cadenaNum + ", " + t;
            n1 = n2;
            n2 = t;
        }
        System.out.println(cadenaNum);
    }
}
