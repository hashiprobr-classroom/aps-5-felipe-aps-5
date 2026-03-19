package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    private List<Tarefa> tarefas;

    public Lista(List<Tarefa> tarefas) {
        this.tarefas = new ArrayList<>();
    }

    public List<Tarefa> getTarefas() {return tarefas;}

    public void adiciona(Tarefa tarefa){
        for ( Tarefa t : tarefas){
            if (tarefa.getId()!=t.getId()){
                tarefas.add(tarefa);
            }
        }
    }

}
