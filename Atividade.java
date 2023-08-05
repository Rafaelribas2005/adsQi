public class Atividade{
    private String anexo;
    private int cod_atividade;
    private Date data_de_entrega;
    private String nome;

    public String getAnexo() {
        return this.anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public int getCod_atividade() {
        return this.cod_atividade;
    }

    public void setCod_atividade(int cod_atividade) {
        this.cod_atividade = cod_atividade;
    }

    public Date getData_de_entrega() {
        return this.data_de_entrega;
    }

    public void setData_de_entrega(Date data_de_entrega) {
        this.data_de_entrega = data_de_entrega;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "{" +
            " anexo='" + getAnexo() + "'" +
            ", cod_atividade='" + getCod_atividade() + "'" +
            ", data_de_entrega='" + getData_de_entrega() + "'" +
            ", nome='" + getNome() + "'" +
            "}";
    }

}