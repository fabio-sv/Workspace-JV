package modulo08.principioResponsabilidadeSolid;

public class ProgramConta {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setDescricao("Conta Bancaria Jane Blue");

        contaBancaria.diminui100Reais();
        contaBancaria.sacarDinheiro(400);
        contaBancaria.depositoDinheiro(1000);

        System.out.println(contaBancaria);


    }
}
