package aula03;

public class AquecedorTeste {
    public static void main(String[] args) {
        Aquecedor aqc = new Aquecedor(0,100);
        aqc.setIncremento(-1);
        aqc.setIncremento(10);
        aqc.aquecer();
        System.out.println("Temperatura: "+aqc.valorTemperatura()+" graus");
        aqc.aquecer();
        System.out.println("Temperatura: "+aqc.valorTemperatura()+" graus");
        aqc.aquecer();
        System.out.println("Temperatura: "+aqc.valorTemperatura()+" graus");
    }
}
