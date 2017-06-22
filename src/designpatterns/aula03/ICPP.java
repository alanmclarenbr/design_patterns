package designpatterns.aula03;

import designpatterns.aula01.ImpostoEhRoubo;
import designpatterns.aula01.Orcamento;

/**
 * Created by Alan on 22/06/2017.
 */
public class ICPP extends TemplateDeImpostoCondicional{

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }
}
