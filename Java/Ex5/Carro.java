public class Carro{
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeCarro;

    Carro(String marca, String modelo, int ano, String placa, int velocidadeCarro){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeCarro = velocidadeCarro;
    }

    void acelerar(){
        velocidadeCarro += 10;
    }

    void frear(){

        if(velocidadeCarro >= 10){
            velocidadeCarro -= 10;
        }else {
            velocidadeCarro = 0;
        }
    }

    void exibirInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade atual: " + velocidadeCarro);
    }
}