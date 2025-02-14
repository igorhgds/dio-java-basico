package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("Controlando entrada dos produtos");
    }

    private void controlarSaida(){
        System.out.println("Controlando saida dos produtos");
    }

    void entregarIngredientes(){
        System.out.println("Entregando ingredientes");
        controlarSaida();
    }

    void trocarGas(){
        System.out.println("Almoxarife trocando Gas");
    }
}
