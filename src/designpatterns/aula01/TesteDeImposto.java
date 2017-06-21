package designpatterns.aula01;

/**
 * Created by asimplicio on 21/06/17.
 */
public class TesteDeImposto {

    public static void main(String[] args) {
        ICMS icms = new ICMS();
        ISS iss = new ISS();
        ICCC iccc = new ICCC();

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
        Orcamento orcamento = new Orcamento(500);
        calculadorDeImpostos.realizaCalculo(orcamento, icms);
        calculadorDeImpostos.realizaCalculo(orcamento, iss);
        calculadorDeImpostos.realizaCalculo(orcamento, iccc);
    }

}
