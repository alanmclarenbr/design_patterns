package designpatterns.aula02;

import com.sun.org.apache.xpath.internal.operations.Or;
import designpatterns.aula01.Orcamento;

/**
 * Created by Alan on 22/06/2017.
 */
public class DescontoPorVendaCasada implements Desconto{

    private Desconto proximo;

    @Override
    public double desconto(Orcamento orcamento) {
        if(existe("Lapis", orcamento) && existe("Caneta", orcamento)){
            return orcamento.getValor() * 0.05;
        }
        return proximo.desconto(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {

        this.proximo = proximo;
    }

    private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }
}
