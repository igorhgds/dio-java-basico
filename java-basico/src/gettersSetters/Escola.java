package gettersSetters;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setName("Felipe");
        felipe.setAge(8);

        System.out.println("O aluno " + felipe.getName() + " tem " + felipe.getAge() + " anos.");
    }
}
