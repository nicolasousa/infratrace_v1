package Class;

public class Rack {

    private Integer id;
    private String nome;
    private Integer totalSlots;
    private Integer fileiraId;

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

    public Integer getTotalSlots() {
        return totalSlots;
    }

    public void setTotalSlots(Integer totalSlots) {
        this.totalSlots = totalSlots;
    }

    public Integer getFileiraId() {
        return fileiraId;
    }

    public void setFileiraId(Integer fileiraId) {
        this.fileiraId = fileiraId;
    }
}
