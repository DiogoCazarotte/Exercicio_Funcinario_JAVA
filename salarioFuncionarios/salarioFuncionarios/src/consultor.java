public class consultor extends funcionario {
    private Double valorHora;
    private Integer horasTrabalhadas;

    public consultor(String nome, String cpf, Double valorHora, Integer horasTrabalhadas){
        super(nome, cpf);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override 
    public Double calcSalario(){
        return (this.valorHora * this.horasTrabalhadas) ;
    }

    public Double getvalorHora() {
        return this.valorHora;
    }

    public void setvalorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer gethorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }


}
