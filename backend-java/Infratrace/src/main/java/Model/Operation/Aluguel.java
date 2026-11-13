package Model.Operation;

import Model.Crud;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Aluguel implements Crud {

    private Integer id;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private BigDecimal valor;
    private Integer clienteId;
    private Integer rackId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getRackId() {
        return rackId;
    }

    public void setRackId(Integer rackId) {
        this.rackId = rackId;
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
