package aula02;
public class AnimalTeste {
    public static void main(String[] args) {
       Animal gato = new Animal();
       gato.nome = "Zinsky";
       gato.come();

       Animal cao =new Animal("Uau uau");
       cao.dorme();

       Animal maense = new Animal("Kely", "humana",165,63,'F');
       System.out.println("Ola, sou: "+maense.nome+" e sou "+maense.especie);
    }
}
