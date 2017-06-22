package designpatterns.aula02;

import designpatterns.aula01.Orcamento;

/**
 * Created by Alan on 22/06/2017.
 */
public class SemDesconto implements Desconto{

    @Override
    public double desconto(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) {

    }
}
