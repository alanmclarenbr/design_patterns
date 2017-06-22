package designpatterns.aula03;

import designpatterns.aula01.ImpostoEhRoubo;
import designpatterns.aula01.Orcamento;
import designpatterns.aula02.Item;

/**
 * Created by Alan on 22/06/2017.
 */
public class IKCV extends TemplateDeImpostoCondicional{

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento);
    }

    private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
        for(Item item : orcamento.getItens()){
            if(item.getValor() > 100){
                return true;
            }
        }
        return false;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
