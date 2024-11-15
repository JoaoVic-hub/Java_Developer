package Projeto_conta_bancaria.src;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas ;

    public Banco(String nome){
        this.nome = nome; 
        this.contas = new ArrayList<>();
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostrarInfoClientes(){
        for(Conta conta : contas){
            conta.imprimirExtrato();
        }
    }

}
