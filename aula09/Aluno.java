public class Aluno extends Pessoa{
    public String matricula;
    
    public Aluno(String nome, String matricula){
        super(nome);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + "matricula: "+ matricula;
    }
}
