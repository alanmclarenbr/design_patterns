package designpatterns.aula01;

/**
 * Created by asimplicio on 21/06/17.
 */
public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, ImpostoEhRoubo impostoEhRoubo){
        double valor = impostoEhRoubo.calculaImposto(orcamento);

        System.out.println(valor);
    }

}