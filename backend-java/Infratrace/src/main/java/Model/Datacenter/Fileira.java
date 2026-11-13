package Model.Datacenter;

import Model.Crud;

public class Fileira implements Crud {

    private Integer id;
    private String nome;
    private Integer salaId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSalaId() {
        return salaId;
    }

    public void setSalaId(Integer salaId) {
        this.salaId = salaId;
    }

    @Override
    public void buscar() {

    }

    @Override
    public void adicionar() {

    }

    @Override
    public void excluir() {

    }

    @Override
    public void alterar() {

    }
}
