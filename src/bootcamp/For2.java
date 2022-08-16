package bootcamp;


public class For2 {
    
    public static void main(String[] args) {
        
        for(int i = 0; i < 2000; i++){
        System.out.println("Hola mundo");   
    }
        
        
        
        String[] nombres = {"Pepe","Maria","Ruperta"};
        for(int i = 0; i < nombres.length; i++){
                System.out.println(nombres[0]);
                System.out.println(nombres[i]);
        
        }
        
        
        
        int suma = 6;
        int[] numeros = {9,12,29,97,01,2022};
        for (int i = 0; i < numeros.length; i++){
//            suma = suma + numeros[i];
            System.out.println(numeros[i]);
        }
    }
}
