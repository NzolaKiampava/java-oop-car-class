package carro;
public class Carro {
    public static void main(String[] args) {
        // TODO code application logic here
        meuCarro carro1;
        carro1 = new meuCarro();
        
        Motor motor;
        motor = new Motor();
        carro1.liga();
        carro1.cor = "Azul";
        carro1.modelo = "Toyata";
        carro1.acelera(2809);
        motor.modelo = "Toy";
        motor.potencia = 12121;
        carro1.motor = motor;
        carro1.velocidadeAtual = 1212;
        carro1.acelera(1212);
        carro1.pegaMarcha();
        carro1.status();
        motor.statusmotor();
    }
    
}
