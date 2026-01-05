public class Pai{
    private String nome;
    public double salario;
    
    public Pai(){
        nome = "Papá";
    }
    public Pai(String nome){
        this.nome = nome;
        this.salario = 2000;
    }

    public void mostraNome(){
        System.out.println("Nome: "+nome);
    }
  
}
