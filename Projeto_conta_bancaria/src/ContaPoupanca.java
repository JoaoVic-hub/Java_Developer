package Projeto_conta_bancaria.src;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }
    public void imprimirExtrato(){
        System.out.println("=====DADOS DA CONTA POUPANCA=====");
        super.imprimirInfosConta();
    }
}
