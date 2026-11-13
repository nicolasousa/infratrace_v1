package Class;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ativo {

    private Integer id;
    private String nome;
    private String fabricante;
    private String modelo;
    private String numSerie;
    private String patrimonio;
    private String status;
    private LocalDate dataAquisicao;
    private BigDecimal valorCompra;
    private LocalDate garantia;
    private Integer slotInicio;
    private Integer slotFim;
    private LocalDate dataDescarte;
    private String motivoDescarte;
    private LocalDateTime criadoEm;
    private Integer tipoAtivoId;
    private Integer rackId;
    private Integer notaFiscalId;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(LocalDate dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public BigDecimal getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(BigDecimal valorCompra) {
        this.valorCompra = valorCompra;
    }

    public LocalDate getGarantia() {
        return garantia;
    }

    public void setGarantia(LocalDate garantia) {
        this.garantia = garantia;
    }

    public Integer getSlotInicio() {
        return slotInicio;
    }

    public void setSlotInicio(Integer slotInicio) {
        this.slotInicio = slotInicio;
    }

    public Integer getSlotFim() {
        return slotFim;
    }

    public void setSlotFim(Integer slotFim) {
        this.slotFim = slotFim;
    }

    public LocalDate getDataDescarte() {
        return dataDescarte;
    }

    public void setDataDescarte(LocalDate dataDescarte) {
        this.dataDescarte = dataDescarte;
    }

    public String getMotivoDescarte() {
        return motivoDescarte;
    }

    public void setMotivoDescarte(String motivoDescarte) {
        this.motivoDescarte = motivoDescarte;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public Integer getTipoAtivoId() {
        return tipoAtivoId;
    }

    public void setTipoAtivoId(Integer tipoAtivoId) {
        this.tipoAtivoId = tipoAtivoId;
    }

    public Integer getRackId() {
        return rackId;
    }

    public void setRackId(Integer rackId) {
        this.rackId = rackId;
    }

    public Integer getNotaFiscalId() {
        return notaFiscalId;
    }

    public void setNotaFiscalId(Integer notaFiscalId) {
        this.notaFiscalId = notaFiscalId;
    }
}
