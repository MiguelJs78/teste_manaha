package gestaoProdutos.gestaoCliente;

public abstract class Cliente {

    private int codigo;

    private String nome;

    private int telefone;

    private String endereco;

    public Cliente(int codigo, String nome, int telefone, String endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Cliente() {

    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getTelefone(){
        return telefone;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public abstract void realizaCompra();

    public String toString(){
        return "Codigo: " + this.codigo + ", Nome: " + this.nome + ", Telefone: " + this.telefone + ", Endereço: " + this.endereco;
    }
}
