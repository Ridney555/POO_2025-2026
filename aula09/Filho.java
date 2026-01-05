public class Filho extends Pai{
    private int idade;

    public Filho(){
        super("Papa di bola");
        idade = 12;
    }
    @Override
    public void mostraNome() {
        System.out.println("Nha nomi:");
    }

}