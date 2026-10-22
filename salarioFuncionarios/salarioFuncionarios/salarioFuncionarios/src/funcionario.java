
public abstract  class funcionario {
    protected String nome;
    private String cpf;

    //construtor
    public funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    //Método principal
    public abstract Double calcSalario();
    public abstract void exibirdados();

   
    

    //Métodos get e setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getcpf() {
        return this.cpf;
    }

    public void setcpf(String cpf){
        this.cpf = cpf;
    }
    
}
