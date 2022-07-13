
package HerenciaCarro;

import bootcamp.Carro;


public class CarroHidraulico extends Carro {
    Carro CarroHidraulico1 = new Carro();
    
    String MotorHidraulico;

    public CarroHidraulico(){
    super();
    }
    
    public CarroHidraulico(String MotorHidraulico, String color, double motor, String marca, double cilindros, String carroceria) {
        super(color, motor, marca, cilindros, carroceria);
        this.MotorHidraulico = MotorHidraulico;
    }
    
    
    
}
