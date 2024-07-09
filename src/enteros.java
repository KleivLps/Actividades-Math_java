import java.util.Scanner;


public class enteros {
    public static void main(String[] args) {

        Scanner enteros = new Scanner(System.in);

        System.out.println("Ingresa un numero entero");
        int numero = enteros.nextInt();

        //Calculando el valor absoluto con el metodo abs() de Math:

        int valorAbsoluto = Math.abs(numero);

        //Mostrando el resultado en pantalla:

        System.out.println("El valor absoluto de " + numero + " es " + valorAbsoluto + ".");

        enteros.close();
    }
}