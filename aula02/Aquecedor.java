package aula02;
public class Aquecedor {
    //atributo
    int temperatura;

    //construtor
    public Aquecedor(){
       temperatura = 15;
    }

    //metodos
    public void aquecer(){
        temperatura += 5;
    }
     public void arrefecer(){
        temperatura -= 5;
    }
    public int valorTemperatura(){
        return temperatura;
    }
    
}
