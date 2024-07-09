public class aleatoriedad365 {

        public static void main(String[] args) {
            // Generar un número aleatorio en el rango de 0.0 a 1.0
            double numeroAleatorio = Math.random();

            // Escalar el número aleatorio al rango de 1 a 355
            int numeroEscalado = (int) Math.floor(numeroAleatorio * 355) + 1;

            // Mostrar el número aleatorio en pantalla
            System.out.println("El número aleatorio generado es: " + numeroEscalado);
        }
    }