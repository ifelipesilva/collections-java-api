package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;


    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }



    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }


    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }


    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }


    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("nome 2", 40, 1.76);
        ordenacaoPessoa.adicionarPessoa("nome 3", 60, 1.86);
        ordenacaoPessoa.adicionarPessoa("nome 4", 25, 1.56);

        System.out.println(ordenacaoPessoa.ordernarPorAltura());
        System.out.println(ordenacaoPessoa.ordernarPorIdade());
    }


}
