package Construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("113.235.298.56", "Marcos");

        //definimos o endereço de marcos
        marcos.setAddress("Rua do Marcos");

        //como definir o nome e cpf??

        //imprimindo o marcos sem o nome e cpf
        System.out.println(marcos.getName() + " - " + marcos.getCpf());
    }
}
