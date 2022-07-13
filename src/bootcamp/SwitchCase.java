
package bootcamp;


public class SwitchCase {
    
    public static void main(String[] args) {
        
        String clima = "Otoño";
        
        switch(clima){
            case "Verano":
                System.out.println("Esta haciendo sol");
            break;
            case "Otoño":
                System.out.println("Estan callendo hojas");
            break;
            case "Primavera":
                System.out.println("Estan creciendo arboles");
            break;
            case "Invierno":
                System.out.println("Estan nevando");
            break;
            default:
                System.out.println("Estacion desconocida");
                break;
        }
    }
    
}
