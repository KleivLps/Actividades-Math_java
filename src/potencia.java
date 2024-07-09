import java.util.Scanner;

public class potencia {

    public static void main(String[] args) {

        Scanner potencia = new Scanner(System.in);

        //Solicitando la base:
        System.out.println("Ingresa la base ( NUMEROS ENTEROS ):");

        int base = potencia.nextInt();

        //Solicitando el exponente:
        System.out.println("Ingresa el exponente ( NUMEROS ENTEROS ): ");
        int exponente = potencia.nextInt();

        //Calculando el resultado de la potencia :

        double resultado = Math.pow(base, exponente);

        System.out.println("El resultado de " + base + " elevado a la " + exponente +" es " +resultado);

        potencia.close();

    }
}
