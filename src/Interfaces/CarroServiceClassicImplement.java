
package Interfaces;

import Interfaces.CarroServiceInterface;
import HerenciaCarro.CarroElectrico;
import HerenciaCarro.CarroHidraulico;
import bootcamp.Carro;

public class CarroServiceClassicImplement implements CarroServiceInterface{

    @Override
    public Carro crearCarroDemo() {
         System.out.println("Crear Carro Clasico");
      return new CarroHidraulico();
              
    }

    @Override
    public void destruirCarro(Carro carro1) {
        System.out.println("Destruyendo Carro Clasico");
    }

    @Override
    public Carro destruirCarro() {
         System.out.println("Destruyendo Carro Clasico");
         return new CarroHidraulico();
    }
    
    
}
