public class ContaBancaria {
    int numeroConta;
    String nomeTitular;
    float saldo;


    ContaBancaria(int numeroConta, String nomeTitular, float saldo){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    void depositar(float valor){
        saldo += valor;
        System.out.println("Deposito de " + valor + "realizado");
        System.out.println("Novo saldo: "+ saldo);
    }

    void sacar(float valor){
        if(saldo >= valor){
            saldo -= valor;
            System.out.println("Saque no valor " + valor + "realizado");
            System.out.println("Novo saldo: " + saldo);
        } else{
            System.out.println("Nao há saldo sufuciente para o saque");
        }

    }

float consultarSaldo(){
    return saldo;
}

void mostrarInfo(){
    System.out.println("Numero da conta: " + numeroConta);
    System.out.println("Nome do titular: " + nomeTitular);
    System.out.println("Saldo: " + saldo);
}

}