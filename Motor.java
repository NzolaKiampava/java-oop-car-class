package carro;
public class Motor {
    String modelo;
    double potencia;
    
    void statusmotor(){
        System.out.println("Modelo motor "+this.modelo);
        System.out.println("Potencia motor "+this.potencia);
    }
}
