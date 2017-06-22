package designpatterns.aula02;

import designpatterns.aula01.Orcamento;

/**
 * Created by Alan on 22/06/2017.
 */
public class DescontoPorMaisDeQuinhentosReais implements Desconto{

    private Desconto proximo;

    public double desconto(Orcamento orcamento){
        if(orcamento.getValor() > 500){
            return orcamento.getValor() * 0.07;
        }else{
            return proximo.desconto(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto proximo) {

        this.proximo = proximo;
    }
}
