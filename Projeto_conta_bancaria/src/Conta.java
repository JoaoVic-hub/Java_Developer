package Projeto_conta_bancaria.src;

public abstract class Conta implements IConta{
    protected int numero;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;
    private static final int AGENCIA_PADRAO = 1;//E uma constante estatica 
    private static int SEQUENCIAL = 1;//E uma variavel estatica, ou seja, o valor dela nao renicia toda vez que uma conta e instanciada
    
    public abstract void imprimirExtrato();

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;//Primeiro o numero recebe o valor de sequencial e depois sequencial e incrementado
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }
    

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) {
        if(saldo > 0 && saldo >= valor) {
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente!!!");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(saldo > 0 && saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }else{
            System.out.println("Saldo insuficiente!!!");
        }
        
    }

    @Override
    public void imprimirInfosConta() {
        System.out.println(String.format("AGENCIA: %d", this.agencia));
        System.out.println(String.format("TITULAR: %s", this.cliente.getNome()));
        System.out.println(String.format("NUMERO: %d", this.numero));
        System.out.println(String.format("SALDO: %.2f", this.saldo));
    }

}
