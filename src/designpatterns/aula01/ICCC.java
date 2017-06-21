package designpatterns.aula01;

/**
 * Created by asimplicio on 21/06/17.
 */
public class ICCC implements ImpostoEhRoubo {

    @Override
    public double calculaImposto(Orcamento orcamento) {
        if(orcamento.getValor()<1000){
            return orcamento.getValor()*0.05;
        }else if(orcamento.getValor()>=1000 && orcamento.getValor()<=3000){
            return orcamento.getValor()*0.07;
        }else if(orcamento.getValor()>3000){
            return orcamento.getValor()*0.08 + 30;
        }
        return 0;
    }
}
