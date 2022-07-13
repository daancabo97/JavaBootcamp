
package Interfaces;

import HerenciaCarro.CarroElectrico;
import Interfaces.CarroServiceInterface;
import bootcamp.Carro;


public class CarroServiceSportImplement implements CarroServiceInterface{

    @Override
    public Carro crearCarroDemo() {
        System.out.println("Crear Carro Deportivo");
        return new CarroElectrico();
    }

    @Override
    public void destruirCarro(Carro carro2) {
        
    }

    @Override
    public Carro destruirCarro() {
       System.out.println("Destruyendo Carro Deportivo");
        return new CarroElectrico();
       
    }
    
    
}
