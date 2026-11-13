package Model.Operation;

import java.time.LocalDateTime;

public class Movimentacao {

    private Integer id;
    private LocalDateTime data;
    private String motivo;
    private Integer slotInicio;
    private Integer slotFim;
    private Integer ativoId;       // FK para Ativo
    private Integer usuarioId;     // FK para Usuario
    private Integer rackOrigemId;  // FK para Rack (Origem)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Integer getSlotInicio() {
        return slotInicio;
    }

    public void setSlotInicio(Integer slotInicio) {
        this.slotInicio = slotInicio;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Integer getSlotFim() {
        return slotFim;
    }

    public void setSlotFim(Integer slotFim) {
        this.slotFim = slotFim;
    }

    public Integer getAtivoId() {
        return ativoId;
    }

    public void setAtivoId(Integer ativoId) {
        this.ativoId = ativoId;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Integer getRackOrigemId() {
        return rackOrigemId;
    }

    public void setRackOrigemId(Integer rackOrigemId) {
        this.rackOrigemId = rackOrigemId;
    }
}
