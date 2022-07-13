package bootcamp;

import HerenciaCarro.CarroElectrico;

public class CarroMain {

    public static void main(String[] args) {
        Carro Carro1 = new Carro("rojo", 3.0, "Mazda", 2.0, "Sedan");
        Carro1.marca = "Chevrolet";
        Carro1.acelerar(50);

        System.out.println("Carro1:" + Carro1);

        // 1
        CarroElectrico carroElectrico1 = new CarroElectrico();
        carroElectrico1.carroceria = "camioneta";
        carroElectrico1.cilindros = 2.0;
        carroElectrico1.color = "Azul";
        carroElectrico1.marca = "Renault";
        carroElectrico1.motor = 6.0;
        System.out.println("carro electrico1:" + carroElectrico1);

        // 2
        CarroElectrico carroElectrico2 = new CarroElectrico("Negro", 2.0, "Toyota", 4, "Camioneta", "ZTX200");
        System.out.println("carro electrico2:" + carroElectrico2);

        /**/ // Funcion
        carroElectrico2.acelerar(60);
        System.out.println("carro electrico2:" + carroElectrico2);

    }

}
