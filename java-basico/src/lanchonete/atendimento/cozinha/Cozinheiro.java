package lanchonete.atendimento.cozinha;

public class Cozinheiro {

    public void adicionarLancheNoBalcao(){
        //pode ser default
        System.out.println("Adicionando no balcao");
    }

    public void adicionarSucoNoBalcao(){
        //pode ser default
        System.out.println("Adicionando suco");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche(){
        System.out.println("Preparando lanche");
    }

    private void prepararVitamina(){
        System.out.println("Preparando Vitamina");
    }

    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche(){
        System.out.println("Selecionando o pão, salada");
    }

    private void selecionarIngredientesVitamina(){
        System.out.println("Selecionando fruta, leite");
    }

    private void lavarIngredientes(){
        System.out.println("Lavando os ingredientes");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
