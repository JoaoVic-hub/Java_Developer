package Projeto_conta_bancaria.src;

public class ContaCorrente  extends Conta{
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
    public void imprimirExtrato(){
        System.out.println("=====DADOS DA CONTA CORRENTE=====");
        super.imprimirInfosConta();
    }
}
