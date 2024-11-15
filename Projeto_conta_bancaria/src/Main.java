package Projeto_conta_bancaria.src;

public class Main {
    public static void main(String [] args){
        Banco banco = new Banco("Banco do Brasil");
        Conta conta1 = new ContaCorrente(new Cliente("Jortan"));
        Conta conta2 = new ContaPoupanca(new Cliente("Neide"));
        conta1.depositar(1000);
        conta1.transferir(108, conta2);
        //Abaixo, com banco.getContas() basicamente chama a lista de contas que esta armazenada na instancia de banco, que tem o nome de bando do brasil
        banco.getContas().add(conta1);
        banco.getContas().add(conta2);

        banco.mostrarInfoClientes();

    }

}
