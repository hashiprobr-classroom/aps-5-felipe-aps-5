package br.edu.insper.desagil.pi.freela;

public class Tarefa {

    private int id;
    private String descricao;
    private Momento inicio;
    private Momento fim;

    public Tarefa(int id, String descricao, Momento inicio, Momento fim) {
        this.id = id;
        this.descricao = "";
        this.inicio = null;
        this.fim = null;
    }

    public int getId() {return id;}

    public String getDescricao() {return descricao;}

    public Momento getInicio() {return inicio;}

    public Momento getFim() {return fim;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public void atualiza(Momento novoInicio, Momento novoFim){
        int tempoi = novoInicio.minutos();
        int tempof = novoFim.minutos();

        if(tempoi<tempof) {
            this.inicio = novoInicio;
            this.fim = novoFim;
        }
        else {
            throw new IllegalArgumentException("O inicio deve ser antes do fim");
            }
    }

}
