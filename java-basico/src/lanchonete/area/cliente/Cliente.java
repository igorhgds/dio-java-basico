package lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche(){
    System.out.println("Escolhendo o lanche");
    }

    public void fazerPedido(){
        System.out.println("Fazendo pedido");
    }

    public void pagarConta(){
        consultarSaldoAplicativo();
        System.out.println("Pagando conta");
    }

    private void consultarSaldoAplicativo(){
        System.out.println("Consultando saldo aplicativo");
    }
}
