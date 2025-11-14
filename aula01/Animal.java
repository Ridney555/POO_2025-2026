package aula01;
public class Animal {
    //caracteristicas (atributos) - o que TEM
    String nome;
    String especie;
    int altura;
    int peso;
    char genero;

    //comportamento (metodos) - o que FAZ
    void come(){
        System.out.println(nome+" come..");
    }
    void dorme(){
        System.out.println(nome+" dorme..");
    }
}
