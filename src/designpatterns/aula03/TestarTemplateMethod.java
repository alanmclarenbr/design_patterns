package designpatterns.aula03;

import designpatterns.aula01.Orcamento;
import designpatterns.aula02.Item;

/**
 * Created by Alan on 22/06/2017.
 */
public class TestarTemplateMethod {

    public static void main(String[] args) {
        ICPP icpp = new ICPP();
        IKCV ikcv = new IKCV();

        Orcamento orcamento = new Orcamento(600);
        orcamento.adicionaItem(new Item("Caneta", 250.0));
        orcamento.adicionaItem(new Item("Lapis", 250.0));

        System.out.println(icpp.calculaImposto(orcamento));
        System.out.println(ikcv.calculaImposto(orcamento));
    }

}
