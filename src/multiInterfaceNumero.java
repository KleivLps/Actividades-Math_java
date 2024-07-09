import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class multiInterfaceNumero {
    public static void main(String[] args) {
        Scanner aleatoriedad= new Scanner(System.in);

        System.out.println("Ingrese un numero entre 1 y 30 :");
        int limiteNumeral = aleatoriedad.nextInt();

        //Generacion del if - else:
        if (limiteNumeral < 1 || limiteNumeral >30) {
            System.out.println("El numero ingresado no esta dentro del rango establecido (Minimo 1 y Maximo 30).");
        } else {
            //Añadido del generador del numero aleatorio
            int numeroAleatorio = (int) (Math.random()* limiteNumeral) +1;
            double raizCuadrada = Math.sqrt(numeroAleatorio);

            //Verificando si el numero aleatorio es primo y ver si cuenta con divisores:
            boolean numeroPrimo = true;

            List<Integer> divisor = new ArrayList<>();

            //Generador del if - else del numero primo:
            if (numeroAleatorio <= 1) {
                numeroPrimo = false;
            } else {
                for(int i =2; i<= Math.sqrt(numeroAleatorio); i++) {

                    //Generador del if - else del divisor :
                    if (numeroAleatorio %i ==0) {
                        numeroPrimo = false;
                        divisor.add(i);
                        if (i != numeroAleatorio/i) {
                            divisor.add(numeroAleatorio/i);
                        }
                    }
                }
            }

            //Imprimiendo resultados:

            System.out.println("El numero aleatorio generado es: " +numeroAleatorio);

            if (numeroPrimo) {
                System.out.println("El numero aleatorio ' " +numeroAleatorio+ " ' es primo.");
            } else {
                System.out.println("El numero aleatorio " +numeroAleatorio+" no es primo, es divisible por " +divisor);
            }

            System.out.println("La raiz cuadrada del numero aleatorio ' " +numeroAleatorio+ " ' es:" +raizCuadrada);

        }
        aleatoriedad.close();
    }
}
