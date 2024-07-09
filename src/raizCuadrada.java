
import java.util.Scanner;

public class raizCuadrada {

    public static void main(String[] args) {
        Scanner raiz = new Scanner(System.in);

        //Solicitar el numero positivo

        System.out.println(" ¡¡Hola!! Ingresa un numero positivo : ");
        double numero = raiz.nextDouble();

        // Veriicador de numero positivo :

        if ( numero < 0 ) {

            System.out.println("El numero ingresado es negativo, por favor ingrese un numero positivo.");
        } else {

            //calculo de raiz cuadrada :

            double raizCuadrada = Math.sqrt(numero);

            //imprimiendo en consola:
            System.out.println("La raiz cuadrada de " +numero + " es " +raizCuadrada);
        }

        raiz.close();

    }
}
