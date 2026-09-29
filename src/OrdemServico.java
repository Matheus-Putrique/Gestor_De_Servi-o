import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrdemServico {
    private String cliente;
    private int id;
    private LocalDate Dataabertura;
    private LocalDate Dataprevisao;
    private LocalDateTime Datafechamento;
    private StatusOS status;
    private List<OrdemServico> itens;

    public OrdemServico(){}

    public OrdemServico(String cliente, int id, LocalDate Dataabertura, LocalDate Dataprevisao, LocalDateTime Datafechamento){
        this.cliente = cliente;
        this.id = id;
        this.Dataabertura = LocalDate.now();
        this.Dataprevisao = Dataprevisao;
        this.Datafechamento = null;
        this.status = status.PENDENTE;
        this.itens = new ArrayList<OrdemServico>();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataabertura() {
        return Dataabertura;
    }

    public void setDataabertura(LocalDate dataabertura) {
        Dataabertura = dataabertura;
    }

    public LocalDate getDataprevisao() {
        return Dataprevisao;
    }

    public void setDataprevisao(LocalDate dataprevisao) {
        Dataprevisao = dataprevisao;
    }

    public LocalDateTime getDatafechamento() {
        return Datafechamento;
    }

    public void setDatafechamento(LocalDateTime datafechamento) {
        Datafechamento = datafechamento;
    }

    public StatusOS getStatus() {
        return status;
    }

    public void setStatus(StatusOS status) {
        this.status = status;
    }

    public List<OrdemServico> getItens() {
        return itens;
    }

    public void setItens(List<OrdemServico> itens) {
        this.itens = itens;
    }
}
