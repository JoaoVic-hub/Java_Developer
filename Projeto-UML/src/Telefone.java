package src;
public class Telefone extends Iphone{
    private String contato;

    public void ligar(String contato){
        System.out.println("Ligando para " + contato);
    }
}
