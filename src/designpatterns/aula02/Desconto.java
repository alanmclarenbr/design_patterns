package designpatterns.aula02;

import designpatterns.aula01.Orcamento;

/**
 * Created by Alan on 22/06/2017.
 */
public interface Desconto {

    double desconto(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
