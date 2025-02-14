package Construtores;

public class Pessoa {
    private String name;
    private String cpf;
    private String address;

    //metodo construtor
    public Pessoa(String cpf, String name) {
        this.cpf = cpf;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //...
    //setters de nome e cpf ???
}
