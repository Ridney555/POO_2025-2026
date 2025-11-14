package aula03;
public class Aquecedor{
    //atributo
    int temperatura;
    int min;
    int max;
    int incremento;

    //construtor
    public Aquecedor(int novoMin, int novoMax){
        temperatura=15;
        min = novoMin;
        max = novoMax;
        incremento = 5;
    }
    //metodos
    public void aquecer(){ 
        if((temperatura + incremento) > max){
            System.out.println("Valor invalido. Temperatura nao pode ser superior ao valor maximo");
            return;
        }
        temperatura  += incremento; 
    }
    public void arrefecer(){
        if((temperatura - incremento) < min){
            System.out.println("Valor invalido. Temperatura nao pode ser inferior ao valor minimo");
            return;
        }
        temperatura-=incremento;
    }
    public void setIncremento(int novoIncremento){
        if(novoIncremento <0){
            System.out.println("Valor invalido. Incremento nao pode ser inferior a zero");
            return;
        }
        incremento = novoIncremento;
    }
    public int valorTemperatura(){
        return temperatura;
    }
}