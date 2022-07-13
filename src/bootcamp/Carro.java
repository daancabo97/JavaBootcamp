package bootcamp;

public class Carro {

    // Atributos
    protected String color;
    protected double motor;
    protected String marca;
    protected double cilindros;
    protected String carroceria;
    protected int velocidad = 0;

    
  
    
    // Constructor
    
    public Carro(){
    
    }
      
    public Carro(String color, double motor, String marca, double cilindros, String carroceria) {
        this.color = color;
        this.motor = motor;
        this.marca = marca;
        this.cilindros = cilindros;
        this.carroceria = carroceria;
    }


    /**/ // Comportamiento  
    public void acelerar(int cantidad) {
        if (cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }

    }

    @Override
    public String toString() {
        return "ClaseCarro{" + 
                "color=" + color + 
                ", motor=" + motor + 
                ", marca=" + marca + 
                ", cilindros=" + cilindros +
                ", carroceria=" + carroceria + 
                ", velocidad=" + velocidad +
                '}';
    }
    

}
