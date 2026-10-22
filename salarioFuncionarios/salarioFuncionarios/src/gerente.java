public class gerente extends funcionario {
    private Double bonificacao;

    public gerente(String nome, String cpf, Double bonificacao){
        super(nome, cpf);
        this.bonificacao = bonificacao;
    }

    @Override
    public Double calcSalario(){
        return (1621.00 * 6) + this.bonificacao ;
    }

    public Double getBonificacao() {
        return this.bonificacao;
    }

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }


}
