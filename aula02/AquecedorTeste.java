package aula02;

public class AquecedorTeste {
    public static void main(String[] args) {
        Aquecedor aqc = new Aquecedor();
        aqc.aquecer();
        System.out.println(aqc.valorTemperatura());
    }
}
