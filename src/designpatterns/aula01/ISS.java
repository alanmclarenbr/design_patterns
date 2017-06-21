package designpatterns.aula01;

/**
 * Created by asimplicio on 21/06/17.
 */
public class ISS implements ImpostoEhRoubo {

    @Override
    public double calculaImposto(Orcamento orcamento) {
        return orcamento.getValor()*0.06;
    }
}
