package designpatterns.aula03;

import designpatterns.aula01.ImpostoEhRoubo;
import designpatterns.aula01.Orcamento;

/**
 * Created by Alan on 22/06/2017.
 */
public abstract class TemplateDeImpostoCondicional implements ImpostoEhRoubo{

    @Override
    public double calculaImposto(Orcamento orcamento) {
        if(deveUsarMaximaTaxacao(orcamento)){
            return maximaTaxacao(orcamento);
        }else{
            return minimaTaxacao(orcamento);
        }
    }

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

    public abstract double maximaTaxacao(Orcamento orcamento);

    public abstract double minimaTaxacao(Orcamento orcamento);
}
