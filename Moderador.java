public class Moderador {
    private int cod_administrador;
    private String cpf; 
    private String nome;
    private String senha;

    public int getCod_administrador() {
        return this.cod_administrador;
    }

    public void setCod_administrador(int cod_administrador) {
        this.cod_administrador = cod_administrador;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "{" +
            " cod_administrador='" + getCod_administrador() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", nome='" + getNome() + "'" +
            ", senha='" + getSenha() + "'" +
            "}";
    }
    

}