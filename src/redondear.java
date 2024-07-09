import java.util.Scanner;

public class redondear {

 public static void main(String[] args) {
  Scanner Redondeo = new Scanner(System.in);

  //solicitando un numero decimal:

  System.out.println(" Hola, ingresa un numero decimal : ");

  double numeroDecimal = Redondeo.nextDouble();

  //calculando el valor redondeado usando round() de Math :

  long cantidadRedondeada = Math.round(numeroDecimal);

  //Motrando en pantalla :

  System.out.println(" El valor redondeado de " + numeroDecimal + " es " + cantidadRedondeada + ".");

  Redondeo.close();

 }
}
