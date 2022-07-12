package aula28.questao03;

import java.util.LinkedList;

public class Cliente {
    private String nome;
    private LinkedList<OrdemDeServico> ordemDeServicos = new LinkedList<>();

    public Cliente(String nome) {
        if (nome.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public void associaOS(OrdemDeServico ordem){
        this.ordemDeServicos.add(ordem);
    }

    public String toString(){
        String info = "";
        info += "\nNome: " + this.nome;
        if (this.ordemDeServicos.size() == 0){
            info += "\nCliente Sem Ordem de Serviços!";
        }else {
            for (int i = 0; i < this.ordemDeServicos.size(); i++){
                info += "\nOrdem De Serviços " + (i + 1) + " : " + this.ordemDeServicos.get(i).resolvida();
            }
        }
        return info;
    }
}
