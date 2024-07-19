package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavasUnicasSet = new HashSet<>();
    }



    public void adicionarPalavra(String palavra){
        palavasUnicasSet.add(palavra);
    }



    public void removerPalavra(String palavra){
        if(!palavasUnicasSet.isEmpty()){
            if(palavasUnicasSet.contains(palavra)){
                palavasUnicasSet.remove(palavra);
            } else {
                System.out.println("palavra nao encontrada");
            }
        } else {
            System.out.println("Conjunto vazio!");
        }

    }


    public boolean verificarPalavra(String palavra){
       return palavasUnicasSet.contains(palavra);
    }


    public void exibirPalavrasUnicas(){
        if(!palavasUnicasSet.isEmpty()){
            System.out.println(palavasUnicasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");


        conjuntoLinguagens.exibirPalavrasUnicas();


        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();


        conjuntoLinguagens.removerPalavra("Swift");

        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));


        conjuntoLinguagens.exibirPalavrasUnicas();

    }
}
