public abstract  class funcionario {
    private String nome;
    private String cpf;

    //construtor
    public funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    //Método principal
    public abstract Double calcSalario();
    

    //Métodos get e setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
