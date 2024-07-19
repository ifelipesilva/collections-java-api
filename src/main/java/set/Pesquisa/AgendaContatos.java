package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }




    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }


    public void exibirContato(){
        System.out.println(contatosSet);
    }


    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatosSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }


    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtulizado = null;

        for(Contato c : contatosSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtulizado = c;
                break;
            }
        }

        return contatoAtulizado;


    }


    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();


        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila c", 444444);
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("ze", 3333333);



        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
        System.out.println("Contato atualizado " + agendaContatos.atualizarNumeroContato("ze", 4002904));

    }


}
