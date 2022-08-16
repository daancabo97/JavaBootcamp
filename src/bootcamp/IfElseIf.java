package bootcamp;

public class IfElseIf {

    public static void main(String[] args) {

        String dia = "Lunes";

        // Ejemplos comparar
        boolean resultadoCompararNumero = 5 == 5;
        boolean resultado = dia.equals("Martes");

        // if else if
        if (dia.equals("Lunes")) {
            System.out.println("Si correcto es Lunes");
        } else if (dia.equals("Martes")) {
            System.out.println("Si correcto es Martes");
         } else if (dia.equals("Miercoles")) {
            System.out.println("Si correcto es Miercoles");
         } else if (dia.equals("Jueves")) {
            System.out.println("Si correcto es Jueves");
         } else if (dia.equals("Viernes")) {
            System.out.println("Si correcto es Viernes");
         } else if (dia.equals("Sabado")) {
            System.out.println("Si correcto es Sabado");
         } else if (dia.equals("Domingo")) {
            System.out.println("Si correcto es Domingo");
        } else{
             System.out.println("El dia Introducido no es un dia valido");
        }
    }
}
