package bootcamp;

public class StringMain {

    public static void main(String[] args) {

        // La clase String
        /*
            length() : Imprime la longitud de un texto
            starsWith("")
            endsWitch("")
            indexOf("")
            subString(1,5)
            trim(): Alinea texto
            equals()
            compareTo
         */
        String mensaje = "  Hola Mundo  ";
        System.out.println(mensaje.length());
        String mensajeMAYUSCULAS = mensaje.toUpperCase();
        System.out.println(mensajeMAYUSCULAS);
        System.out.println(mensajeMAYUSCULAS.trim());

        mensajeMAYUSCULAS = mensajeMAYUSCULAS.trim();

        String otro = "HOLA MUNDO";
        if (mensajeMAYUSCULAS.equalsIgnoreCase(otro)) {
            System.out.println("Verdadero!!");

        }

    }

}
