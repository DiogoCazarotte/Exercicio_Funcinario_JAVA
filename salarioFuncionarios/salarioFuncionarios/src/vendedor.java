public class vendedor extends funcionario{
    private String nome;
    private String cpf;
    private Double comissao;
    private Integer numerosVendas;

    //Construtor
    public vendedor(String nome, String cpf, Double comissao, Integer numerosVendas){
        super(nome, cpf);
        this.comissao = comissao;
        this.numerosVendas = numerosVendas;
    }

    @Override 
    public Double calcSalario(){
        return 1621.00 + (this.comissao * this.numerosVendas);
    }


    //get e set
    public Double getComissao() {
        return this.comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public Integer getNumerosVendas() {
        return this.numerosVendas;
    }

    public void setNumerosVendas(Integer numerosVendas) {
        this.numerosVendas = numerosVendas;
    }
}
