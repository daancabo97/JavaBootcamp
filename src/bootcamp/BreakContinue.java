
package bootcamp;


public class BreakContinue {
    
   
    public static void main(String[] args) {

        int count = 0;
        while(count <= 10){
            count++;
            if(count == 6)
//                break;
                continue;
                
            System.out.println(count + " " + "Hola mundo");
            
        }
        System.out.println("Fin");
    }
    
}

    

