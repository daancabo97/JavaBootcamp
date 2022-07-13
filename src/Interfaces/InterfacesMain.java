// Aplicamos polimorfismo sobre Interfaces
// Las interfaces nos permiten desacoplar el codigo

package Interfaces;

import bootcamp.Carro;


public class InterfacesMain  {
    public static void main(String[] args) {
        
        CarroServiceInterface service1 = new CarroServiceClassicImplement();
        CarroServiceInterface service2 = new CarroServiceSportImplement();
        
        Carro carro1 = service1.destruirCarro();
        
        Carro carro2 = service2.crearCarroDemo();
        
        
        
        
    }
    
}
