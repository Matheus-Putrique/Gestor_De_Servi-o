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
    private List<ItemServico> itens;

    public OrdemServico(){}

    public OrdemServico(String cliente, int id,LocalDate Dataprevisao){
        this.cliente = cliente;
        this.id = id;
        this.Dataabertura = LocalDate.now();
        this.Dataprevisao = Dataprevisao;
        this.Datafechamento = null;
        this.status = status.PENDENTE;
        this.itens = new ArrayList<>();
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

    public List<ItemServico> getItens() {
        return itens;
    }

    public void setItens(List<ItemServico> itens) {
        this.itens = itens;
    }
    public boolean adicionarItem(ItemServico itens) {
        if(this.status == StatusOS.CONCLUIDO || this.status == StatusOS.CANCELADA) {
            return false;
        }
        this.itens.add(itens);
        return true;
    }
    public boolean iniciarServico(){
        if(this.status == StatusOS.PENDENTE){
            this.status = StatusOS.EM_ANDAMENTO;
            this.Dataabertura = LocalDate.now();
            return true;
        }
        return false;
    }
    public boolean finalizarServico(){
        if(this.status == StatusOS.EM_ANDAMENTO){
            this.status = StatusOS.CONCLUIDO;
            this.Datafechamento = LocalDateTime.now();
            return true;
        }
        return false;
    }
    public double calcularTotal(){
        double total = 0;

        for(int i = 0; i < this.itens.size(); i++){
            total += this.itens.get(i).getValor();
        }
        return total;
    }
}
