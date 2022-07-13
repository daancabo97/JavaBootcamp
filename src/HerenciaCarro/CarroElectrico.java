package HerenciaCarro;

import bootcamp.Carro;

public class CarroElectrico extends Carro {

    String motorElectrico;

    public CarroElectrico() {
    }

    public CarroElectrico(String color, double motor, String marca, double cilindros, String carroceria, String motorElectrico) {
        super(color, motor, marca, cilindros, carroceria);
        this.motorElectrico = motorElectrico;
    }

    public CarroElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    
    
    /**/ // Sobreescritura de Funciones
    public void acelerar(int cantidad) {
        int cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);

    }

    
    
    @Override
    public String toString() {
        return "ClaseCarro{"
                + "color=" + color
                + ", motor=" + motor
                + ", marca=" + marca
                + ", cilindros=" + cilindros
                + ", carroceria=" + carroceria
                + ", velocidad=" + velocidad
                + ", motorElectrico=" + motorElectrico
                + '}';
    }

}
