package carro;
public class meuCarro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    boolean chave;
    Motor motor;
    
    //LIGA O CARRO
    void liga(){
        this.chave = true;
    }
    void acelera(double quantidade){
        if(this.chave == true){
            this.velocidadeMaxima = this.velocidadeAtual + quantidade;
        }else System.out.println("nao esta ligado");
    }
    int pegaMarcha(){
        if(this.velocidadeAtual < 0){
            return -1;
        }
        if(this.velocidadeAtual >= 0 && this.velocidadeAtual < 40){
            return 1;
        }
        if(this.velocidadeAtual >= 40 && this.velocidadeAtual < 80){
            return 2;
        }
        return 3;
    }
    void status(){
        System.out.println("COR "+this.cor);
        System.out.println("Modelo "+this.modelo);
        System.out.println("VelocidadeAtual "+this.velocidadeAtual);
        System.out.println("VelocidadeMaxima "+this.velocidadeMaxima);
        System.out.println("CHAVE "+this.chave);
    }
}
