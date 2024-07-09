import java.util.Scanner;

public class numeroAleatorio {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Ingrese el limite inferior (entero): ");
        int limiteInferior = numero.nextInt();

        System.out.println("Ingrese el limite superior (entero mayor que el limite inferior): ");
        int limiteSuperior = numero.nextInt();

        //validando que el numero sea mayor que el limite inferior:
        if(limiteSuperior <= limiteInferior) {
            System.out.println("El limite superior debe ser mayor que el limite inferior.");
            return;
        }

        int numeroAleatorio = (int) (Math.random() * (limiteSuperior - limiteInferior +1)) + limiteInferior;

        System.out.println("El numero aleatorio entre " +limiteInferior+ " y " + limiteSuperior + " es " +numeroAleatorio);

        numero.close();
        }

    }



