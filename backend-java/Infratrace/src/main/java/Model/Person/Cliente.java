package Model.Person;

import Model.Crud;

public class Cliente implements Crud {

    private Integer id;
    private String nome;
    private String cnpj;
    private String representante;
    private Boolean ativo;
    private Integer tipoClienteId;

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

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Integer getTipoClienteId() {
        return tipoClienteId;
    }

    public void setTipoClienteId(Integer tipoClienteId) {
        this.tipoClienteId = tipoClienteId;
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
