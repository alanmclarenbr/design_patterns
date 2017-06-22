package designpatterns.aula01;

import designpatterns.aula02.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by asimplicio on 21/06/17.
 */
public class Orcamento {
    private final double valor;
    private final List<Item> itens;

    public Orcamento(double valor){
        this.valor = valor;
        itens = new ArrayList<Item>();
    }

    public double getValor() {
        return valor;
    }

    public void adicionaItem(Item item){
        itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }
}
