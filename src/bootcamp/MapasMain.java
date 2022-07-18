// LOS MAPAS SON ESTRUCTURAS DE DATOS QUE NOS PERMITEN TRABAJAR CON PARES DE LLAVE  VALOR
// put : Es un metoso que nos permite especificar una llave
// keySet : retorna una vista del mapa como un conjunto de llaves
// values(): retorna una vista del mapa como un conjunto de valores
// entrySet(): retorna una vista del mapa como un conjunto de parejas clave-valor, de la clase interna Entry.

package bootcamp;

import java.util.HashMap;
import java.util.Map;

public class MapasMain {
    
    public static void main(String[] args) {
        
        
        // Para trabajar con listas especificamos los tipos de datos de las llaves y los valores
        Map<String , String > personas = new HashMap<>();
        personas.put("1032488904A", "Daniel Caicedo");
        personas.put("1032488904B", "Daniel Caicedo");
        personas.put("1032488904C", "Daniel Caicedo");
        personas.put("1032488904D", "Daniel Caicedo");
        
        System.out.println(personas);
        
        // Iteramos para imprimir solo las llaves dentro del mapa
        
        for(String key : personas.keySet()){
            System.out.println("llave : " + key);
            
        // Iteramos para imprimir solo los valores dentro del mapa
        
        for(String Value : personas.values()){
            System.out.println("valor : " + Value);
        
        }
        
        // Iteramos para imprimir llave y valor
        
        for (Map.Entry<String, String> pair : personas.entrySet()){
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }}
       
        
    }
    
}
