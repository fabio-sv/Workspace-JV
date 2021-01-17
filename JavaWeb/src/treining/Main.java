package treining;

public class Main {
    public static void main(String[] args) {


        Aluno aluno = new Aluno();

        aluno.setNome("ane");
        aluno.setIdade(17);

        aluno.setLogin("adg");
        aluno.setSenha("adg");

        if (aluno.validacao() == true){

            System.out.println("Validado");

        }else if (aluno.validacao() == false){
            System.out.println("Não validado");
        }
    }
}
