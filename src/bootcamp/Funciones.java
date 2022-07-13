
package bootcamp;


public class Funciones {
    
    public static void main(String[] args) {
        
//        holaMundo();
//        holaMundo();
   
//        holaMundo("Daniel");
//        holaMundo("Andres");
        
    
        String adios = devolverHola();
        System.out.println(adios);
        
        PruebaTest(); 
        
             
        // Sobre carga de funciones
        holaMundo("Daniel","Caicedo");
        holaMundo("Daniel", "Caicedo", 25);
        
    }
    
    
    // Sobre carga de funciones
    

    private static void holaMundo() {
        System.out.println(" Hola Mundo");
        System.out.println(" Hola Mundo");
        
    }
    
    private static void holaMundo(String nombre) {
        System.out.println(" Hola Mundo 1 : " + nombre);
      
    }
    
    private static void holaMundo(String nombre, String apellido) {
        System.out.println(" Hola Mundo 2: " + " nombre =" + nombre + " apellido = " + apellido);
      
    }
    
    private static void holaMundo(String nombre, String apellido, int edad) {
    System.out.println(" Hola Mundo 3 :" + "nombre =" + nombre + " apellido = " + apellido + " edad = " + edad);
      
    }
    
    private static String devolverHola(){
        return "Hasta Luego";
        
    }
    
    public static void PruebaTest(){
        System.out.println("Realizando prueba desde otra clase");
        
    }
    
    public static int sumar(int num1 , int num2){
    return num1 + num2;
    }
    
}
