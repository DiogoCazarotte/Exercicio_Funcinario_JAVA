import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        //objetos
        consultor o_Consultor = new consultor("Luiz","465122874", 500.0, 8);
        vendedor o_Vendedor = new vendedor("Lucas", "4697885412", 1.0, 90);
        gerente o_Gerente = new gerente("Ruan", "469552117", 500.00);

        //colocando os objetos dentro da ArrayList
        ArrayList<funcionario> funcionario = new ArrayList<>();
        funcionario.add(o_Consultor);
        funcionario.add(o_Gerente);
        funcionario.add(o_Vendedor);

        for(funcionario n : funcionario){
            n.exibirdados();
        }
    }
}
