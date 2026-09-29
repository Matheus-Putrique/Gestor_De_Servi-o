public class ItemServico {
    private String nome;
    private String decricao;
    private double valor;

    public ItemServico(String nome, String decricao, double valor) {
        this.nome = nome;
        this.decricao = decricao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
